package headFirstPatternDeputyRemotePartTwo;

import java.io.Serializable;

public interface State extends Serializable {   // Просто разширяем интерефейс Serializable который не имеет методов - и теперь обьект State  
                                                // во всех субклассах может передаваться по сети.
	public void insertQuater();
	public void ejectQuater();
	public void turnCrank();
	public void despense();
	
}
