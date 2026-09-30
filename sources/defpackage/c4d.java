package defpackage;

import ai.askquin.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c4d {
    public static final c4d E0;
    public static final c4d F0;
    public static final c4d G0;
    public static final /* synthetic */ c4d[] H0;
    public static final c4d X;
    public static final c4d Y;
    public static final c4d Z;
    public static final c4d a;
    public static final c4d b;
    public static final c4d c;
    public static final c4d d;
    public static final c4d e;
    public static final c4d f;
    public static final c4d g;
    public static final c4d v;
    public static final c4d w;
    public static final c4d x;
    public static final c4d y;
    public static final c4d z;
    private final q3d action;
    private final ju6 icon;
    private final Integer tag;
    private final int title;

    static {
        Integer numValueOf = Integer.valueOf(R.string.settings_new_feature_label);
        c4d c4dVar = new c4d("SignIn", 0, R.string.settings_sign_in, new iu6(cgg.B()), null, 12);
        c4d c4dVar2 = new c4d("Account", 1, R.string.settings_account, new iu6(cgg.B()), null, 12);
        a = c4dVar2;
        gx6 gx6VarB = urg.R;
        if (gx6VarB == null) {
            fx6 fx6Var = new fx6("Filled.Autorenew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = msf.a;
            dtd dtdVar = new dtd(y72.b);
            s71 s71Var = new s71(1);
            s71Var.p(12.0f, 6.0f);
            s71Var.t(3.0f);
            s71Var.o(4.0f, -4.0f);
            s71Var.o(-4.0f, -4.0f);
            s71Var.t(3.0f);
            s71Var.j(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
            s71Var.j(0.0f, 1.57f, 0.46f, 3.03f, 1.24f, 4.26f);
            s71Var.n(6.7f, 14.8f);
            s71Var.j(-0.45f, -0.83f, -0.7f, -1.79f, -0.7f, -2.8f);
            s71Var.j(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
            s71Var.h();
            s71Var.p(18.76f, 7.74f);
            s71Var.n(17.3f, 9.2f);
            s71Var.j(0.44f, 0.84f, 0.7f, 1.79f, 0.7f, 2.8f);
            s71Var.j(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
            s71Var.t(-3.0f);
            s71Var.o(-4.0f, 4.0f);
            s71Var.o(4.0f, 4.0f);
            s71Var.t(-3.0f);
            s71Var.j(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
            s71Var.j(0.0f, -1.57f, -0.46f, -3.03f, -1.24f, -4.26f);
            s71Var.h();
            fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
            gx6VarB = fx6Var.b();
            urg.R = gx6VarB;
        }
        c4d c4dVar3 = new c4d("AutoRenew", 2, R.string.auto_renew_title, new iu6(gx6VarB), null, 12);
        c4d c4dVar4 = new c4d("SkinMall", 3, R.string.settings_skin_mall, new hu6(R.drawable.settings_skin_mall, false), null, 12);
        b = c4dVar4;
        gx6 gx6VarB2 = od4.b0;
        if (gx6VarB2 == null) {
            fx6 fx6Var2 = new fx6("Outlined.RateReview", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = msf.a;
            dtd dtdVar2 = new dtd(y72.b);
            s71 s71Var2 = new s71(1);
            s71Var2.p(20.0f, 2.0f);
            s71Var2.n(4.0f, 2.0f);
            s71Var2.j(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            s71Var2.n(2.0f, 22.0f);
            s71Var2.o(4.0f, -4.0f);
            s71Var2.m(14.0f);
            s71Var2.j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            s71Var2.n(22.0f, 4.0f);
            s71Var2.j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            s71Var2.h();
            s71Var2.p(20.0f, 16.0f);
            s71Var2.n(5.17f, 16.0f);
            s71Var2.o(-0.59f, 0.59f);
            s71Var2.o(-0.58f, 0.58f);
            s71Var2.n(4.0f, 4.0f);
            s71Var2.m(16.0f);
            s71Var2.t(12.0f);
            s71Var2.h();
            s71Var2.p(10.5f, 14.0f);
            s71Var2.n(18.0f, 14.0f);
            s71Var2.t(-2.0f);
            s71Var2.m(-5.5f);
            s71Var2.h();
            s71Var2.p(14.36f, 8.13f);
            s71Var2.j(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
            s71Var2.o(-1.77f, -1.77f);
            s71Var2.j(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
            s71Var2.n(6.0f, 11.53f);
            s71Var2.n(6.0f, 14.0f);
            s71Var2.m(2.47f);
            s71Var2.o(5.89f, -5.87f);
            s71Var2.h();
            fx6.a(fx6Var2, s71Var2.b, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
            gx6VarB2 = fx6Var2.b();
            od4.b0 = gx6VarB2;
        }
        c4d c4dVar5 = new c4d("ReviewReward", 4, R.string.settings_review_reward, new iu6(gx6VarB2), null, 12);
        c = c4dVar5;
        c4d c4dVar6 = new c4d("AnnualFortune", 5, R.string.annual_fortune_2026_settings_title, new hu6(R.drawable.settings_annual_fortune, false), null, 12);
        d = c4dVar6;
        c4d c4dVar7 = new c4d("FourSeasons", 6, R.string.four_seasons_2026_settings_title, new hu6(R.drawable.settings_four_seasons, true), numValueOf, 8);
        e = c4dVar7;
        c4d c4dVar8 = new c4d("Challenge", 7, R.string.text_challenge, new hu6(R.drawable.settings_challenge, true), null, 12);
        f = c4dVar8;
        c4d c4dVar9 = new c4d("WeComFriend", 8, R.string.wecom_friend_entry, new hu6(R.drawable.settings_wecom_friend, true), Integer.valueOf(R.string.wecom_perks_tag), 8);
        g = c4dVar9;
        c4d c4dVar10 = new c4d("JoinCommunityGroup", 9, R.string.join_community, new hu6(R.drawable.settings_community_group, true), null, 12);
        v = c4dVar10;
        c4d c4dVar11 = new c4d("Gift", 10, R.string.settings_invite, new hu6(R.drawable.settings_invite_friends, true), null, 12);
        w = c4dVar11;
        c4d c4dVar12 = new c4d("FriendCoupon", 11, R.string.friend_coupon_title, new hu6(R.drawable.settings_friend_coupon, true), null, 12);
        x = c4dVar12;
        c4d c4dVar13 = new c4d("GiftCard", 12, R.string.gift_card_entry, new hu6(R.drawable.settings_gift_card, true), null, 12);
        y = c4dVar13;
        c4d c4dVar14 = new c4d("InputInvitation", 13, R.string.invitation_code_entry, new hu6(R.drawable.settings_redeem, true), null, 12);
        z = c4dVar14;
        c4d c4dVar15 = new c4d("NotificationSettings", 14, R.string.settings_notification_settings, new hu6(R.drawable.settings_notification, true), null, 12);
        X = c4dVar15;
        c4d c4dVar16 = new c4d("Language", 15, R.string.settings_language, new hu6(R.drawable.settings_language, true), null, 12);
        Y = c4dVar16;
        c4d c4dVar17 = new c4d("Theme", 16, R.string.settings_theme, new hu6(R.drawable.settings_theme, true), null, 12);
        Z = c4dVar17;
        c4d c4dVar18 = new c4d("WidgetOnboarding", 17, R.string.settings_widget_onboarding, new hu6(R.drawable.settings_widget_onboarding, true), numValueOf, 8);
        E0 = c4dVar18;
        c4d c4dVar19 = new c4d("HelpAndFeedback", 18, R.string.settings_help_and_feedback, new hu6(R.drawable.settings_help, true), null, 12);
        F0 = c4dVar19;
        c4d c4dVar20 = new c4d("About", 19, R.string.settings_about, new hu6(R.drawable.settings_about, true), null, 12);
        G0 = c4dVar20;
        H0 = new c4d[]{c4dVar, c4dVar2, c4dVar3, c4dVar4, c4dVar5, c4dVar6, c4dVar7, c4dVar8, c4dVar9, c4dVar10, c4dVar11, c4dVar12, c4dVar13, c4dVar14, c4dVar15, c4dVar16, c4dVar17, c4dVar18, c4dVar19, c4dVar20, new c4d("Developer", 20, R.string.settings_dev, new hu6(R.drawable.settings_dev, true), null, 12)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4d(String str, int i, int i2, ju6 ju6Var, Integer num, int i3) {
        super(str, i);
        num = (i3 & 4) != 0 ? null : num;
        this.title = i2;
        this.icon = ju6Var;
        this.tag = num;
        this.action = q3d.a;
    }

    public static c4d valueOf(String str) {
        return (c4d) Enum.valueOf(c4d.class, str);
    }

    public static c4d[] values() {
        return (c4d[]) H0.clone();
    }

    public final ju6 a() {
        return this.icon;
    }

    public final Integer b() {
        return this.tag;
    }

    public final int c() {
        return this.title;
    }
}
