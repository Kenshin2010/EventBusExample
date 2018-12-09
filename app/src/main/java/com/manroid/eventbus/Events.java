package com.manroid.eventbus;

public class Events {

	// Event used to send message from fragment to activity.
	public static class FragmentActivityMessage {

		private String message;
		private Computer computer;

        public FragmentActivityMessage(String message) {
            this.message = message;
        }

        public FragmentActivityMessage(Computer computer) {
            this.computer = computer;
        }

        public FragmentActivityMessage(String message, Computer computer) {
            this.message = message;
            this.computer = computer;
        }

		public String getMessage() {
			return message;
		}

        public Computer getComputer() {
            return computer;
        }
	}

	// Event used to send message from activity to fragment.
	public static class ActivityFragmentMessage {

		private String message;
        private Computer computer;

        public ActivityFragmentMessage(String message) {
            this.message = message;
        }

        public ActivityFragmentMessage(Computer computer) {
            this.computer = computer;
        }

        public ActivityFragmentMessage(String message, Computer computer) {
            this.message = message;
            this.computer = computer;
        }

        public String getMessage() {
            return message;
        }

        public Computer getComputer() {
            return computer;
        }
	}

	// Event used to send message from activity to activity.
	public static class ActivityActivityMessage {

		private String message;
        private Computer computer;

        public ActivityActivityMessage(String message) {
            this.message = message;
        }

        public ActivityActivityMessage(Computer computer) {
            this.computer = computer;
        }

        public ActivityActivityMessage(String message, Computer computer) {
            this.message = message;
            this.computer = computer;
        }

        public String getMessage() {
            return message;
        }

        public Computer getComputer() {
            return computer;
        }
    }
}
