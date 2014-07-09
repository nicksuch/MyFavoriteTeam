package com.example.myfavoriteteam.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.myfavoriteteam.R.drawable;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 4 sample players.
		addItem(new DummyItem("1", "Michael Jordan", "Guard", drawable.jordan));
		addItem(new DummyItem("2", "Scotty Pippen", "Forward", drawable.pippen));
		addItem(new DummyItem("3", "Dennis Rodman", "Forward", drawable.rodman));
		addItem(new DummyItem("4", "Horace Grant", "Center", drawable.grant));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a player.
	 */
	public static class DummyItem {
		public String id;
		public String player_name;
		public String player_position;
		public int player_image;

		public DummyItem(String id, String player_name, String player_position, int player_image) {
			this.id = id;
			this.player_name = player_name;
			this.player_position = player_position;
			this.player_image = player_image;
		}

		@Override
		public String toString() {
			return player_name;
		}
		
		public String toString2() {
			return player_position;
		}
	}
}
