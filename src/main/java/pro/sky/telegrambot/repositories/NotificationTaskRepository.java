package pro.sky.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.telegrambot.model.NotificationTask;

import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Integer> {
    @Query(value = "SELECT * FROM notification_task WHERE notification_task.day_of_year = ?1", nativeQuery = true)// запрос в БД
    List<NotificationTask> findAllByLocalDate_DayOfYear(int dayOfYear);
}
//SELECT * FROM notification_task WHERE notification_task.datetime = ?1