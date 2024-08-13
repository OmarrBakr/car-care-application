package Control;

import Entity.User;

public interface WaitingListStrategy {
	User execute(CarCareCenter carCareCenter);
}
