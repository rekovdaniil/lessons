package template;

abstract public class AbstractApp {
  public AbstractApp() {
    init();
  }

  abstract protected void init();
  
  public void run() {
    configure();
    invoke();
    destroy();
  }

  abstract protected void configure();
  abstract protected void invoke();
  abstract protected void destroy();
}