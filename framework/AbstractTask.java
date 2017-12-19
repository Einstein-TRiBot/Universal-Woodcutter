package scripts.UniversalWoodcutter.framework;
/**
 * 
 * @author Einstein
 *
 *
 */
public interface AbstractTask {

	String info();

	boolean shouldExecute();

	void execute();

}