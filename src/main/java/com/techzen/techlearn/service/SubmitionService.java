package com.techzen.techlearn.service;

import com.techzen.techlearn.dto.response.PageResponse;
import com.techzen.techlearn.dto.response.ReviewResponseDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface SubmitionService {

    void addSubmit(String linkGithub, String resultReview);

    PageResponse<?> getAllReviews(int page, int pageSize, UUID userId, long assignmentId);

    ReviewResponseDTO getReviewById(long assignment, UUID id);
}