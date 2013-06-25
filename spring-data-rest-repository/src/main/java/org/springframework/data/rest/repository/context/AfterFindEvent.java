package org.springframework.data.rest.repository.context;

/**
 * Emitted after a find in the repository.
 *
 * @author Paulo Avelar
 */
public class AfterFindEvent
    extends RepositoryEvent {
  public AfterFindEvent(Object source) {
    super(source);
  }
}
