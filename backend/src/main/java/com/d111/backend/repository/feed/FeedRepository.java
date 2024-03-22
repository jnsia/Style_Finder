package com.d111.backend.repository.feed;

import com.d111.backend.entity.feed.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {

    List<Feed> findAllByOrderByFeedLikesDesc();
}


