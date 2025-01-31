package com.example.samuraitravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
//	メールアドレスでユーザーを検索
	public User findByEmail(String email);
//	名前またはフリガナで部分一致検索
	public Page<User> findByNameLikeOrFuriganaLike(String nameKeyword,String furiganaKeyword,Pageable pageable);
	
////	私追加→１時間以上前の未認証ユーザーを削除
//	@Transactional
//	@Modifying
//	@Query("DELETE FROM User u WHERE u.verified = false AND u.createdAt <= :expiryTime")
//	void deleteUnverifiedUsers(LocalDateTime expiryTime);
}
