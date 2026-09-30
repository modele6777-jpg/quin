package defpackage;

import ai.askquin.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mld {
    public static final mld E0;
    public static final mld F0;
    public static final mld G0;
    public static final /* synthetic */ mld[] H0;
    public static final mld X;
    public static final mld Y;
    public static final mld Z;
    public static final mld a;
    public static final mld b;
    public static final mld c;
    public static final mld d;
    public static final mld e;
    public static final mld f;
    public static final mld g;
    public static final mld v;
    public static final mld w;
    public static final mld x;
    public static final mld y;
    public static final mld z;
    private final int boxDesc;
    private final int cardCover;
    private final List<old> colorfulBanners;
    private final int desc;
    private final List<old> greyscaleBanners;
    private final int icon;
    private final String lottieAsset;
    private final String lottieDarkAsset;
    private final Integer painterName;
    private final Integer pickerCaption;
    private final int previewCard;
    private final int slogan;
    private final int title;

    static {
        mld mldVar = new mld("RiderWaite", 0, t72.I(new old(R.drawable.skin_banner_classic_1), new old(R.drawable.skin_banner_classic_2), new old(R.drawable.skin_banner_classic_3), new old(R.drawable.skin_banner_classic_4), new old(R.drawable.skin_banner_classic_5)), null, R.string.skin_classic_title, R.string.skin_classic_slogan, R.string.skin_classic_desc, R.string.skin_classic_box_desc, R.drawable.the_fool_classic, R.drawable.card_cover, R.drawable.skin_menu_classic, "lottie/deck/rider_waite_light.json", null, Integer.valueOf(R.string.skin_classic_picker_caption), 2050);
        a = mldVar;
        mld mldVar2 = new mld("NeoRiderWaite", 1, mldVar.colorfulBanners, t72.I(new old(R.drawable.skin_banner_neo_rider_waite_neo_1), new old(R.drawable.skin_banner_neo_rider_waite_neo_2), new old(R.drawable.skin_banner_neo_rider_waite_neo_3), new old(R.drawable.skin_banner_neo_rider_waite_neo_4), new old(R.drawable.skin_banner_neo_rider_waite_neo_5)), R.string.skin_neo_rider_waite_title, R.string.skin_classic_slogan, R.string.skin_neo_rider_waite_desc, R.string.skin_classic_box_desc, R.drawable.the_fool_neo_rider_waite, R.drawable.card_cover_neo, R.drawable.skin_menu_neo_rider_waite, "lottie/deck/neo_rider_waite.json", null, Integer.valueOf(R.string.skin_neo_rider_waite_picker_caption), 3072);
        b = mldVar2;
        mld mldVar3 = new mld("Cat", 2, t72.I(new old(R.drawable.skin_banner_cat_1), new old(R.drawable.skin_banner_cat_2), new old(R.drawable.skin_banner_cat_3), new old(R.drawable.skin_banner_cat_4), new old(R.drawable.skin_banner_cat_5)), t72.I(new old(R.drawable.skin_banner_cat_neo_1), new old(R.drawable.skin_banner_cat_neo_2), new old(R.drawable.skin_banner_cat_neo_3), new old(R.drawable.skin_banner_cat_neo_4), new old(R.drawable.skin_banner_cat_neo_5)), R.string.skin_cat_title, R.string.skin_cat_slogan, R.string.skin_cat_desc, R.string.skin_cat_box_desc, R.drawable.the_fool_cat, R.drawable.card_back_cat, R.drawable.skin_menu_cat, "lottie/deck/cat.json", null, Integer.valueOf(R.string.skin_cat_picker_caption), 3072);
        c = mldVar3;
        mld mldVar4 = new mld("NewRomantic", 3, t72.I(new old(R.drawable.skin_banner_new_romantic_1), new old(R.drawable.skin_banner_new_romantic_2), new old(R.drawable.skin_banner_new_romantic_3), new old(R.drawable.skin_banner_new_romantic_4), new old(R.drawable.skin_banner_new_romantic_5)), t72.I(new old(R.drawable.skin_banner_new_romantic_neo_1), new old(R.drawable.skin_banner_new_romantic_neo_2), new old(R.drawable.skin_banner_new_romantic_neo_3), new old(R.drawable.skin_banner_new_romantic_neo_4), new old(R.drawable.skin_banner_new_romantic_neo_5)), R.string.skin_new_romantic_title, R.string.skin_new_romantic_slogan, R.string.skin_new_romantic_desc, R.string.skin_new_romantic_box_desc, R.drawable.the_fool_romantic, R.drawable.card_back_romantic, R.drawable.skin_menu_new_romantic, "lottie/deck/new_romantic.json", null, Integer.valueOf(R.string.skin_new_romantic_picker_caption), 3072);
        d = mldVar4;
        mld mldVar5 = new mld("Skin3D", 4, t72.I(new old(R.drawable.skin_banner_3d_1), new old(R.drawable.skin_banner_3d_2), new old(R.drawable.skin_banner_3d_3), new old(R.drawable.skin_banner_3d_4), new old(R.drawable.skin_banner_3d_5)), t72.I(new old(R.drawable.skin_banner_3d_neo_1), new old(R.drawable.skin_banner_3d_neo_2), new old(R.drawable.skin_banner_3d_neo_3), new old(R.drawable.skin_banner_3d_neo_4), new old(R.drawable.skin_banner_3d_neo_5)), R.string.skin_3d_title, R.string.skin_3d_slogan, R.string.skin_3d_desc, R.string.skin_3d_box_desc, R.drawable.the_fool_puppet, R.drawable.card_back_puppet, R.drawable.skin_menu_3d, "lottie/deck/skin_3d.json", null, Integer.valueOf(R.string.skin_3d_picker_caption), 3072);
        e = mldVar5;
        mld mldVar6 = new mld("Symbolism", 5, t72.I(new old(R.drawable.skin_banner_symbolism_classic_1), new old(R.drawable.skin_banner_symbolism_classic_2), new old(R.drawable.skin_banner_symbolism_classic_3), new old(R.drawable.skin_banner_symbolism_classic_4), new old(R.drawable.skin_banner_symbolism_classic_5)), t72.I(new old(R.drawable.skin_banner_symbolism_classic_1), new old(R.drawable.skin_banner_symbolism_classic_2), new old(R.drawable.skin_banner_symbolism_3), new old(R.drawable.skin_banner_symbolism_classic_4), new old(R.drawable.skin_banner_symbolism_classic_5)), R.string.skin_symbolism_title, R.string.skin_symbolism_slogan, R.string.skin_symbolism_desc, R.string.skin_symbolism_box_desc, R.drawable.the_fool_symbolism, R.drawable.card_back_symbolism, R.drawable.skin_menu_symbolism, "lottie/deck/symbolism.json", null, Integer.valueOf(R.string.skin_symbolism_picker_caption), 3072);
        f = mldVar6;
        mld mldVar7 = new mld("Minimalism", 6, t72.I(new old(R.drawable.skin_banner_minimalism_classic_1), new old(R.drawable.skin_banner_minimalism_classic_2), new old(R.drawable.skin_banner_minimalism_classic_3), new old(R.drawable.skin_banner_minimalism_classic_4), new old(R.drawable.skin_banner_minimalism_classic_5)), t72.I(new old(R.drawable.skin_banner_minimalism_classic_1), new old(R.drawable.skin_banner_minimalism_classic_2), new old(R.drawable.skin_banner_minimalism_3), new old(R.drawable.skin_banner_minimalism_classic_4), new old(R.drawable.skin_banner_minimalism_classic_5)), R.string.skin_minimalism_title, R.string.skin_minimalism_slogan, R.string.skin_minimalism_desc, R.string.skin_minimalism_box_desc, R.drawable.the_fool_minimalism, R.drawable.card_back_minimalism, R.drawable.skin_menu_minimalism, "lottie/deck/minimalism.json", null, Integer.valueOf(R.string.skin_minimalism_picker_caption), 3072);
        g = mldVar7;
        mld mldVar8 = new mld("Fable", 7, t72.I(new old(R.drawable.skin_banner_fable_1), new old(R.drawable.skin_banner_fable_5), new old(R.drawable.skin_banner_fable_2), new old(R.drawable.skin_banner_fable_3), new old(R.drawable.skin_banner_fable_4)), t72.I(new old(R.drawable.skin_banner_fable_neo_1), new old(R.drawable.skin_banner_fable_neo_5), new old(R.drawable.skin_banner_fable_neo_2), new old(R.drawable.skin_banner_fable_neo_3), new old(R.drawable.skin_banner_fable_neo_4)), R.string.skin_fable_title, R.string.skin_fable_slogan, R.string.skin_fable_desc, R.string.skin_fable_box_desc, R.drawable.the_fool_fable, R.drawable.card_back_fable, R.drawable.skin_menu_fable, "lottie/deck/fable.json", null, Integer.valueOf(R.string.skin_fable_picker_caption), 3072);
        v = mldVar8;
        mld mldVar9 = new mld("Woodcut", 8, t72.I(new old(R.drawable.skin_banner_woodcut_1), new old(R.drawable.skin_banner_woodcut_5), new old(R.drawable.skin_banner_woodcut_2), new old(R.drawable.skin_banner_woodcut_3), new old(R.drawable.skin_banner_woodcut_4)), t72.I(new old(R.drawable.skin_banner_woodcut_neo_1), new old(R.drawable.skin_banner_woodcut_neo_5), new old(R.drawable.skin_banner_woodcut_neo_2), new old(R.drawable.skin_banner_woodcut_neo_3), new old(R.drawable.skin_banner_woodcut_neo_4)), R.string.skin_woodcut_title, R.string.skin_woodcut_slogan, R.string.skin_woodcut_desc, R.string.skin_woodcut_box_desc, R.drawable.the_fool_woodcut, R.drawable.card_back_woodcut, R.drawable.skin_menu_woodcut, "lottie/deck/woodcut.json", null, Integer.valueOf(R.string.skin_woodcut_picker_caption), 3072);
        w = mldVar9;
        mld mldVar10 = new mld("Dream", 9, t72.I(new old(R.drawable.skin_banner_dream_1), new old(R.drawable.skin_banner_dream_5), new old(R.drawable.skin_banner_dream_2), new old(R.drawable.skin_banner_dream_3), new old(R.drawable.skin_banner_dream_4)), t72.I(new old(R.drawable.skin_banner_dream_neo_1), new old(R.drawable.skin_banner_dream_neo_5), new old(R.drawable.skin_banner_dream_neo_2), new old(R.drawable.skin_banner_dream_neo_3), new old(R.drawable.skin_banner_dream_neo_4)), R.string.skin_dream_title, R.string.skin_dream_slogan, R.string.skin_dream_desc, R.string.skin_dream_box_desc, R.drawable.the_fool_dream, R.drawable.card_back_dream, R.drawable.skin_menu_dream, "lottie/deck/dream.json", null, Integer.valueOf(R.string.skin_dream_picker_caption), 3072);
        x = mldVar10;
        mld mldVar11 = new mld("Prism", 10, t72.I(new old(R.drawable.skin_banner_prism_1), new old(R.drawable.skin_banner_prism_5), new old(R.drawable.skin_banner_prism_2), new old(R.drawable.skin_banner_prism_3), new old(R.drawable.skin_banner_prism_4)), t72.I(new old(R.drawable.skin_banner_prism_neo_1), new old(R.drawable.skin_banner_prism_neo_5), new old(R.drawable.skin_banner_prism_neo_2), new old(R.drawable.skin_banner_prism_neo_3), new old(R.drawable.skin_banner_prism_neo_4)), R.string.skin_prism_title, R.string.skin_prism_slogan, R.string.skin_prism_desc, R.string.skin_prism_box_desc, R.drawable.the_fool_prism, R.drawable.card_back_prism, R.drawable.skin_menu_prism, "lottie/deck/prism.json", null, Integer.valueOf(R.string.skin_prism_picker_caption), 3072);
        y = mldVar11;
        mld mldVar12 = new mld("Midnight", 11, t72.I(new old(R.drawable.skin_banner_midnight_1), new old(R.drawable.skin_banner_midnight_5), new old(R.drawable.skin_banner_midnight_2), new old(R.drawable.skin_banner_midnight_3), new old(R.drawable.skin_banner_midnight_4)), t72.I(new old(R.drawable.skin_banner_midnight_neo_1), new old(R.drawable.skin_banner_midnight_neo_5), new old(R.drawable.skin_banner_midnight_neo_2), new old(R.drawable.skin_banner_midnight_neo_3), new old(R.drawable.skin_banner_midnight_neo_4)), R.string.skin_midnight_title, R.string.skin_midnight_slogan, R.string.skin_midnight_desc, R.string.skin_midnight_box_desc, R.drawable.the_fool_midnight, R.drawable.card_back_midnight, R.drawable.skin_menu_midnight, "lottie/deck/midnight.json", null, Integer.valueOf(R.string.skin_midnight_picker_caption), 3072);
        z = mldVar12;
        mld mldVar13 = new mld("DarkGold", 12, t72.I(new old(R.drawable.skin_banner_darkgold_1), new old(R.drawable.skin_banner_darkgold_5), new old(R.drawable.skin_banner_darkgold_2), new old(R.drawable.skin_banner_darkgold_3), new old(R.drawable.skin_banner_darkgold_4)), t72.I(new old(R.drawable.skin_banner_darkgold_neo_1), new old(R.drawable.skin_banner_darkgold_neo_5), new old(R.drawable.skin_banner_darkgold_neo_2), new old(R.drawable.skin_banner_darkgold_neo_3), new old(R.drawable.skin_banner_darkgold_neo_4)), R.string.skin_darkgold_title, R.string.skin_darkgold_slogan, R.string.skin_darkgold_desc, R.string.skin_darkgold_box_desc, R.drawable.the_fool_darkgold, R.drawable.card_back_darkgold, R.drawable.skin_menu_darkgold, "lottie/deck/dark_gold.json", null, Integer.valueOf(R.string.skin_darkgold_picker_caption), 3072);
        X = mldVar13;
        mld mldVar14 = new mld("ZenithDay", 13, t72.I(new old(R.drawable.skin_banner_zenith_day_1), new old(R.drawable.skin_banner_zenith_day_2), new old(R.drawable.skin_banner_zenith_day_3), new old(R.drawable.skin_banner_zenith_day_4), new old(R.drawable.skin_banner_zenith_day_5)), t72.I(new old(R.drawable.skin_banner_zenith_day_1), new old(R.drawable.skin_banner_zenith_day_2), new old(R.drawable.skin_banner_zenith_day_neo_3), new old(R.drawable.skin_banner_zenith_day_4), new old(R.drawable.skin_banner_zenith_day_5)), R.string.skin_zenith_day_title, R.string.skin_zenith_day_slogan, R.string.skin_zenith_day_desc, R.string.skin_zenith_day_box_desc, R.drawable.the_fool_zenith_day, R.drawable.card_back_zenith_day, R.drawable.skin_menu_zenith_day, "lottie/deck/zenith_day.json", Integer.valueOf(R.string.skin_zenith_day_painter), null, 5120);
        Y = mldVar14;
        mld mldVar15 = new mld("EternalNight", 14, t72.I(new old(R.drawable.skin_banner_eternal_night_1), new old(R.drawable.skin_banner_eternal_night_2), new old(R.drawable.skin_banner_eternal_night_3), new old(R.drawable.skin_banner_eternal_night_4), new old(R.drawable.skin_banner_eternal_night_5)), t72.I(new old(R.drawable.skin_banner_eternal_night_1), new old(R.drawable.skin_banner_eternal_night_2), new old(R.drawable.skin_banner_eternal_night_neo_3), new old(R.drawable.skin_banner_eternal_night_4), new old(R.drawable.skin_banner_eternal_night_5)), R.string.skin_eternal_night_title, R.string.skin_eternal_night_slogan, R.string.skin_eternal_night_desc, R.string.skin_eternal_night_box_desc, R.drawable.the_fool_eternal_night, R.drawable.card_back_eternal_night, R.drawable.skin_menu_eternal_night, "lottie/deck/eternal_night.json", Integer.valueOf(R.string.skin_eternal_night_painter), null, 5120);
        Z = mldVar15;
        mld mldVar16 = new mld("Transformation", 15, t72.I(new old(R.drawable.skin_banner_transformation_1), new old(R.drawable.skin_banner_transformation_2), new old(R.drawable.skin_banner_transformation_3), new old(R.drawable.skin_banner_transformation_4), new old(R.drawable.skin_banner_transformation_5)), t72.I(new old(R.drawable.skin_banner_transformation_neo_1), new old(R.drawable.skin_banner_transformation_neo_2), new old(R.drawable.skin_banner_transformation_neo_3), new old(R.drawable.skin_banner_transformation_neo_4), new old(R.drawable.skin_banner_transformation_neo_5)), R.string.skin_transformation_title, R.string.skin_transformation_slogan, R.string.skin_transformation_desc, R.string.skin_transformation_box_desc, R.drawable.the_fool_transformation, R.drawable.card_back_transformation, R.drawable.skin_menu_transformation, "lottie/deck/transformation.json", Integer.valueOf(R.string.skin_transformation_painter), null, 5120);
        E0 = mldVar16;
        mld mldVar17 = new mld("SecretManor", 16, t72.I(new old(R.drawable.skin_banner_secret_manor_1), new old(R.drawable.skin_banner_secret_manor_2), new old(R.drawable.skin_banner_secret_manor_3), new old(R.drawable.skin_banner_secret_manor_4), new old(R.drawable.skin_banner_secret_manor_5)), t72.I(new old(R.drawable.skin_banner_secret_manor_neo_1), new old(R.drawable.skin_banner_secret_manor_neo_2), new old(R.drawable.skin_banner_secret_manor_neo_3), new old(R.drawable.skin_banner_secret_manor_neo_4), new old(R.drawable.skin_banner_secret_manor_neo_5)), R.string.skin_secret_manor_title, R.string.skin_secret_manor_slogan, R.string.skin_secret_manor_desc, R.string.skin_secret_manor_box_desc, R.drawable.the_fool_secret_manor, R.drawable.card_back_secret_manor, R.drawable.skin_menu_secret_manor, "lottie/deck/secret_manor.json", Integer.valueOf(R.string.skin_secret_manor_painter), null, 5120);
        F0 = mldVar17;
        mld mldVar18 = new mld("MagicAwakening", 17, t72.I(new old(R.drawable.skin_banner_magic_awakening_1), new old(R.drawable.skin_banner_magic_awakening_2), new old(R.drawable.skin_banner_magic_awakening_3), new old(R.drawable.skin_banner_magic_awakening_4), new old(R.drawable.skin_banner_magic_awakening_5)), t72.I(new old(R.drawable.skin_banner_magic_awakening_neo_1), new old(R.drawable.skin_banner_magic_awakening_neo_2), new old(R.drawable.skin_banner_magic_awakening_neo_3), new old(R.drawable.skin_banner_magic_awakening_neo_4), new old(R.drawable.skin_banner_magic_awakening_neo_5)), R.string.skin_magic_awakening_title, R.string.skin_magic_awakening_slogan, R.string.skin_magic_awakening_desc, R.string.skin_magic_awakening_box_desc, R.drawable.the_fool_magic_awakening, R.drawable.card_back_magic_awakening, R.drawable.skin_menu_magic_awakening, "lottie/deck/magic_awakening.json", Integer.valueOf(R.string.skin_magic_awakening_painter), null, 5120);
        G0 = mldVar18;
        H0 = new mld[]{mldVar, mldVar2, mldVar3, mldVar4, mldVar5, mldVar6, mldVar7, mldVar8, mldVar9, mldVar10, mldVar11, mldVar12, mldVar13, mldVar14, mldVar15, mldVar16, mldVar17, mldVar18};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mld(String str, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, Integer num, Integer num2, int i9) {
        super(str, i);
        list2 = (i9 & 2) != 0 ? null : list2;
        String str3 = (i9 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : "lottie/deck/rider_waite_dark.json";
        Integer num3 = (i9 & 2048) != 0 ? null : num;
        Integer num4 = (i9 & 4096) == 0 ? num2 : null;
        this.colorfulBanners = list;
        this.greyscaleBanners = list2;
        this.title = i2;
        this.slogan = i3;
        this.desc = i4;
        this.boxDesc = i5;
        this.previewCard = i6;
        this.cardCover = i7;
        this.icon = i8;
        this.lottieAsset = str2;
        this.lottieDarkAsset = str3;
        this.painterName = num3;
        this.pickerCaption = num4;
    }

    public static mld valueOf(String str) {
        return (mld) Enum.valueOf(mld.class, str);
    }

    public static mld[] values() {
        return (mld[]) H0.clone();
    }

    public final List a(l46 l46Var) {
        if (!k8b.f((e8b) l46Var.k(l8b.a))) {
            return this.colorfulBanners;
        }
        List<old> list = this.greyscaleBanners;
        return list == null ? this.colorfulBanners : list;
    }

    public final int b() {
        return this.boxDesc;
    }

    public final int c() {
        return this.cardCover;
    }

    public final int d() {
        return this.desc;
    }

    public final int e() {
        return this.icon;
    }

    public final String g() {
        return this.lottieAsset;
    }

    public final String h() {
        return this.lottieDarkAsset;
    }

    public final Integer i() {
        return this.painterName;
    }

    public final Integer j() {
        return this.pickerCaption;
    }

    public final int k() {
        return this.previewCard;
    }

    public final int l() {
        return this.slogan;
    }

    public final int m() {
        return this.title;
    }
}
