package br.com.itexto.desafiobackend.service;

import br.com.itexto.desafiobackend.controller.dto.BlogPostRs;
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
    BlogPostRepository blogPostRepository;

    public List<BlogPostRs> findBlogPostLike(String search) {
        List<BlogPost> blogPosts;
        if(search == null) {
            blogPosts = blogPostRepository.findAll();
        } else {
            blogPosts = blogPostRepository.findBlogPostsByTituloOrResumoContains(search,search);
        }
        return blogPosts.stream()
                .sorted()
                .map(BlogPostRs::converter)
                .peek(blogPostRs -> blogPostRs.setUrl(null))
                .collect(Collectors.toList());
    }

    public BlogPostRs findBlogPostById(Long id){
        Optional<BlogPost> blogPost = blogPostRepository.findById(id);
        return blogPost.map(BlogPostRs::converter).orElse(null);
    }
}
