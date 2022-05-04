package com.crowdbotics.testdev24323.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <h1>Task Repository</h1>
 *
 * <p>Spring data repository for {@link Task}.</p>
 * 
 * @author crowdbotics.com
 */
public interface TaskRepository 
	extends JpaRepository<Task, String>
		, JpaSpecificationExecutor<Task>
{
}
