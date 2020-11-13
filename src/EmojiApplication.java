import java.io.IOException;

public class EmojiApplication {
	private static AudienceView audienceView;
		
	public static void main(String[] args) throws IOException {
		startApp();
	}

	public static void startApp() throws IOException {
		delete();
		audienceView = new AudienceView();
		audienceView.setVisible(true);
	}

	public static void delete() {
		audienceView = null;
	}
}
