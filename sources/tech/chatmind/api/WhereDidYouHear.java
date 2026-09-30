package tech.chatmind.api;

import ai.askquin.R;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.x3g;
import defpackage.xn7;
import defpackage.yqf;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Douyin' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Ltech/chatmind/api/WhereDidYouHear;", "", "", "id", "", "stringId", "drawableId", "neoDrawableId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getStringId", "()I", "Ljava/lang/Integer;", "getDrawableId", "()Ljava/lang/Integer;", "getNeoDrawableId", "Companion", "x3g", "Douyin", "Kwai", "Red", "QZone", "FriendsRecommendation", "Channel", "Moments", "TikTok", "Twitter", "Threads", "YouTube", "Instagram", "Others", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class WhereDidYouHear {
    private static final /* synthetic */ lx4 $ENTRIES;
    private static final /* synthetic */ WhereDidYouHear[] $VALUES;
    private static final lw7 $cachedSerializer$delegate;
    public static final WhereDidYouHear Channel;
    public static final x3g Companion;
    public static final WhereDidYouHear Douyin;
    public static final WhereDidYouHear FriendsRecommendation;
    public static final WhereDidYouHear Instagram;
    public static final WhereDidYouHear Kwai;
    public static final WhereDidYouHear Moments;
    public static final WhereDidYouHear Others;
    public static final WhereDidYouHear QZone;
    public static final WhereDidYouHear Red;
    public static final WhereDidYouHear Threads;
    public static final WhereDidYouHear TikTok;
    public static final WhereDidYouHear Twitter;
    public static final WhereDidYouHear YouTube;
    private final Integer drawableId;
    private final String id;
    private final Integer neoDrawableId;
    private final int stringId;

    private static final /* synthetic */ WhereDidYouHear[] $values() {
        return new WhereDidYouHear[]{Douyin, Kwai, Red, QZone, FriendsRecommendation, Channel, Moments, TikTok, Twitter, Threads, YouTube, Instagram, Others};
    }

    static {
        Integer numValueOf = Integer.valueOf(R.drawable.ic_tiktok);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_tiktok_neo);
        Douyin = new WhereDidYouHear("Douyin", 0, "douyin", R.string.where_did_you_hear_douyin, numValueOf, numValueOf2);
        Kwai = new WhereDidYouHear("Kwai", 1, "kwai", R.string.where_did_you_hear_kwai, Integer.valueOf(R.drawable.ic_kwai), Integer.valueOf(R.drawable.ic_kwai_neo));
        Red = new WhereDidYouHear("Red", 2, "rednote", R.string.where_did_you_hear_red, Integer.valueOf(R.drawable.ic_rednote), Integer.valueOf(R.drawable.ic_rednote_neo));
        QZone = new WhereDidYouHear("QZone", 3, "qzone", R.string.where_did_you_hear_qzone, Integer.valueOf(R.drawable.ic_qzone), Integer.valueOf(R.drawable.ic_qzone_neo));
        FriendsRecommendation = new WhereDidYouHear("FriendsRecommendation", 4, "friendRecommend", R.string.where_did_you_hear_referral, Integer.valueOf(R.drawable.ic_friends), Integer.valueOf(R.drawable.ic_friends_neo));
        Channel = new WhereDidYouHear("Channel", 5, "wxChannel", R.string.where_did_you_hear_channel, Integer.valueOf(R.drawable.ic_wevideo), Integer.valueOf(R.drawable.ic_wevideo_neo));
        Moments = new WhereDidYouHear("Moments", 6, "wxMoments", R.string.where_did_you_hear_moments, Integer.valueOf(R.drawable.ic_moment), null, 8, null);
        TikTok = new WhereDidYouHear("TikTok", 7, "tiktok", R.string.where_did_you_hear_tiktok, numValueOf, numValueOf2);
        Twitter = new WhereDidYouHear("Twitter", 8, "twitter", R.string.where_did_you_hear_twitter, Integer.valueOf(R.drawable.ic_x), Integer.valueOf(R.drawable.ic_x_neo));
        Threads = new WhereDidYouHear("Threads", 9, "threads", R.string.where_did_you_hear_threads, null, Integer.valueOf(R.drawable.ic_threads_neo), 4, null);
        YouTube = new WhereDidYouHear("YouTube", 10, "youtube", R.string.where_did_you_hear_youtube, null, Integer.valueOf(R.drawable.ic_youtube_neo), 4, null);
        Instagram = new WhereDidYouHear("Instagram", 11, "instagram", R.string.where_did_you_hear_instagram, Integer.valueOf(R.drawable.ic_ins), Integer.valueOf(R.drawable.ic_ins_neo));
        Others = new WhereDidYouHear("Others", 12, "others", R.string.where_did_you_hear_others, Integer.valueOf(R.drawable.ic_other), Integer.valueOf(R.drawable.ic_other_neo));
        WhereDidYouHear[] whereDidYouHearArr$values = $values();
        $VALUES = whereDidYouHearArr$values;
        $ENTRIES = pa7.Q(whereDidYouHearArr$values);
        Companion = new x3g();
        $cachedSerializer$delegate = eb3.N(z18.b, new yqf(7));
    }

    public /* synthetic */ WhereDidYouHear(String str, int i, String str2, int i2, Integer num, Integer num2, int i3, rp3 rp3Var) {
        this(str, i, str2, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        WhereDidYouHear[] whereDidYouHearArrValues = values();
        whereDidYouHearArrValues.getClass();
        return new wn2("tech.chatmind.api.WhereDidYouHear", whereDidYouHearArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public static WhereDidYouHear valueOf(String str) {
        return (WhereDidYouHear) Enum.valueOf(WhereDidYouHear.class, str);
    }

    public static WhereDidYouHear[] values() {
        return (WhereDidYouHear[]) $VALUES.clone();
    }

    public final Integer getDrawableId() {
        return this.drawableId;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getNeoDrawableId() {
        return this.neoDrawableId;
    }

    public final int getStringId() {
        return this.stringId;
    }

    private WhereDidYouHear(String str, int i, String str2, int i2, Integer num, Integer num2) {
        super(str, i);
        this.id = str2;
        this.stringId = i2;
        this.drawableId = num;
        this.neoDrawableId = num2;
    }
}
