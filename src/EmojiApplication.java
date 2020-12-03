import java.io.IOException;

public class EmojiApplication {
	private static PresenterView presenterView;
		
	public static void main(String[] args) throws IOException {
		startApp();
	}

	public static void startApp() throws IOException  {
		delete();
		presenterView = new PresenterView();
		presenterView.setVisible(true);
		//audienceView = new AudienceView();
		//audienceView.setVisible(true);
	}

	public static void delete() {
		
		presenterView = null;
	}
}
