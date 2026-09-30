package defpackage;

import ai.askquin.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fj8[], still in use, count: 1, list:
  (r0v1 fj8[]) from 0x00ff: CONSTRUCTOR (r0v1 fj8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:256) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fj8 {
    /* JADX INFO: Fake field, exist only in values array */
    Sage(R.drawable.img_sage, "鼠尾草", R.string.luck_item_sage, R.string.luck_item_sage_tags, R.string.luck_item_sage_message),
    /* JADX INFO: Fake field, exist only in values array */
    ClearQuartz(R.drawable.img_clear_quartz, "白水晶", R.string.luck_item_clear_quartz, R.string.luck_item_clear_quartz_tags, R.string.luck_item_clear_quartz_message),
    RoseQuartz(R.drawable.img_rose_quartz, "粉水晶", R.string.luck_item_rose_quartz, R.string.luck_item_rose_quartz_tags, R.string.luck_item_rose_quartz_message),
    /* JADX INFO: Fake field, exist only in values array */
    Obsidian(R.drawable.img_obsidian, "黑曜石", R.string.luck_item_obsidian, R.string.luck_item_obsidian_tags, R.string.luck_item_obsidian_message),
    /* JADX INFO: Fake field, exist only in values array */
    Citrine(R.drawable.img_citrine, "黄水晶", R.string.luck_item_citrine, R.string.luck_item_citrine_tags, R.string.luck_item_citrine_message),
    /* JADX INFO: Fake field, exist only in values array */
    ScentedSachet(R.drawable.img_scented_sachet, "干花香囊", R.string.luck_item_scented_sachet, R.string.luck_item_scented_sachet_tags, R.string.luck_item_scented_sachet_message),
    /* JADX INFO: Fake field, exist only in values array */
    AromaCandle(R.drawable.img_aroma_candle, "香薰蜡烛", R.string.luck_item_aroma_candle, R.string.luck_item_aroma_candle_tags, R.string.luck_item_aroma_candle_message),
    /* JADX INFO: Fake field, exist only in values array */
    Succulent(R.drawable.img_succulent, "多肉植物", R.string.luck_item_succulent, R.string.luck_item_succulent_tags, R.string.luck_item_succulent_message),
    /* JADX INFO: Fake field, exist only in values array */
    LuckyAmulet(R.drawable.img_lucky_amulet, "幸运御守", R.string.luck_item_lucky_amulet, R.string.luck_item_lucky_amulet_tags, R.string.luck_item_lucky_amulet_message),
    /* JADX INFO: Fake field, exist only in values array */
    AromaStone(R.drawable.img_aroma_stone, "扩香石", R.string.luck_item_aroma_stone, R.string.luck_item_aroma_stone_tags, R.string.luck_item_aroma_stone_message),
    /* JADX INFO: Fake field, exist only in values array */
    Dreamcatcher(R.drawable.img_dreamcatcher, "捕梦网", R.string.luck_item_dreamcatcher, R.string.luck_item_dreamcatcher_tags, R.string.luck_item_dreamcatcher_message);

    public static final y25 a = new y25(12);
    public static final /* synthetic */ mx4 d;
    private final String displayName;
    private final int iconRes;
    private final int messageRes;
    private final int nameRes;
    private final int tagsRes;

    static {
        d = new mx4(new fj8[]{r0, r1, r2, new fj8(R.drawable.img_obsidian, "黑曜石", R.string.luck_item_obsidian, R.string.luck_item_obsidian_tags, R.string.luck_item_obsidian_message), new fj8(R.drawable.img_citrine, "黄水晶", R.string.luck_item_citrine, R.string.luck_item_citrine_tags, R.string.luck_item_citrine_message), new fj8(R.drawable.img_scented_sachet, "干花香囊", R.string.luck_item_scented_sachet, R.string.luck_item_scented_sachet_tags, R.string.luck_item_scented_sachet_message), new fj8(R.drawable.img_aroma_candle, "香薰蜡烛", R.string.luck_item_aroma_candle, R.string.luck_item_aroma_candle_tags, R.string.luck_item_aroma_candle_message), new fj8(R.drawable.img_succulent, "多肉植物", R.string.luck_item_succulent, R.string.luck_item_succulent_tags, R.string.luck_item_succulent_message), new fj8(R.drawable.img_lucky_amulet, "幸运御守", R.string.luck_item_lucky_amulet, R.string.luck_item_lucky_amulet_tags, R.string.luck_item_lucky_amulet_message), new fj8(R.drawable.img_aroma_stone, "扩香石", R.string.luck_item_aroma_stone, R.string.luck_item_aroma_stone_tags, R.string.luck_item_aroma_stone_message), new fj8(R.drawable.img_dreamcatcher, "捕梦网", R.string.luck_item_dreamcatcher, R.string.luck_item_dreamcatcher_tags, R.string.luck_item_dreamcatcher_message)});
    }

    public fj8(int i, String str, int i2, int i3, int i4) {
        super(str, i);
        this.iconRes = i;
        this.displayName = str;
        this.nameRes = i2;
        this.tagsRes = i3;
        this.messageRes = i4;
    }

    public static fj8 valueOf(String str) {
        return (fj8) Enum.valueOf(fj8.class, str);
    }

    public static fj8[] values() {
        return (fj8[]) c.clone();
    }

    public final String a() {
        return this.displayName;
    }

    public final int b() {
        return this.iconRes;
    }

    public final int c() {
        return this.messageRes;
    }

    public final int d() {
        return this.nameRes;
    }

    public final int e() {
        return this.tagsRes;
    }
}
