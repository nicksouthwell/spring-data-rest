package org.springframework.data.rest.repository.context;

/**
 * Emitted before an entity is found in the repository.
 *
 * @author Paulo Avelar <phavelar@gmail.com>
 */
public class BeforeFindEvent extends RepositoryEvent {
  public BeforeFindEvent(Object source) {
    super(source);
  }
}
