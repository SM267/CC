package com.shortlinkx.repository;
import com.shortlinkx.entity.ClickEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ClickEventRepository extends JpaRepository<ClickEvent,Long>{long countByShortCode(String shortCode);List<ClickEvent> findTop100ByShortCodeOrderByClickedAtDesc(String shortCode);}
