package br.com.itexto.desafiobackend.service;

import br.com.itexto.desafiobackend.controller.dto.BlogPostResponse;
import br.com.itexto.desafiobackend.model.BlogPost;
import br.com.itexto.desafiobackend.repository.BlogPostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostService {

    private final BlogPostRepository blogPostRepository;

    public List<BlogPostResponse> findBlogPostLike(String search) {
        List<BlogPost> blogPosts;
        if(search == null) {
            blogPosts = blogPostRepository.findAll();
        } else {
            blogPosts = blogPostRepository.findBlogPostsByTituloOrResumoContains(search,search);
        }
        return blogPosts.stream()
                .map(BlogPostResponse::new)
                .peek(BlogPostResponse::ocultarURL)
                .peek(BlogPostResponse::nullToZero)
                .sorted()
                .collect(Collectors.toList());
    }

    public BlogPostResponse findBlogPostById(Long id){
        Optional<BlogPost> blogPost = blogPostRepository.findById(id);
        if(blogPost.isPresent()) {
            BlogPostResponse blogPostResponse = new BlogPostResponse(blogPost.get());
            blogPostResponse.nullToZero();
            return blogPostResponse;
        } else {
            return null;
        }
    }
}
