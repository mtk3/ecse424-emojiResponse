
public class EmojiApplication {
	private static AudienceView audienceView;
		
	public static void main(String[] args) {
		startApp();
	}

	public static void startApp() {
		delete();
		audienceView = new AudienceView();
		audienceView.setVisible(true);
	}

	public static void delete() {
		audienceView = null;
	}
}
