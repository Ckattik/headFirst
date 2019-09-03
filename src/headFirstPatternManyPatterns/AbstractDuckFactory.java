package headFirstPatternManyPatterns;

public abstract class AbstractDuckFactory {          // ћы определ€ем абстракную фабрику котора€ будет реализововатьс€ субклассами
	                                                 // дл€ создани€ разных продуктов
	public abstract Quackable createMallardDuck();   
	public abstract Quackable createRedheadDuck();   //  аждый метод создает одну из разновидностей уток
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();

}
