package ai.askquin.ui.account.component;

import ai.askquin.R;
import defpackage.eb3;
import defpackage.if8;
import defpackage.jl0;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.rl0;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B3\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lai/askquin/ui/account/component/AuthOption;", "", "", "icon", "label", "Lif8;", "loginWay", "", "tint", "<init>", "(Ljava/lang/String;IIILif8;Z)V", "I", "getIcon", "()I", "getLabel", "Lif8;", "getLoginWay", "()Lif8;", "Z", "getTint", "()Z", "Companion", "rl0", "Google", "WeChat", "OneLogin", "Email", "Phone", "Quin.component:account_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum AuthOption {
    Google(R.drawable.ic_google, R.string.auth_using_google, if8.a, false),
    WeChat(R.drawable.ic_wechat, R.string.auth_using_wechat, if8.b, false),
    OneLogin(R.drawable.ic_phone, R.string.auth_using_one_login, if8.c, false, 8, null),
    Email(R.drawable.ic_email, R.string.auth_using_email, null, false, 12, null),
    Phone(R.drawable.ic_phone, R.string.auth_using_phone, null, false, 12, null);

    private final int icon;
    private final int label;
    private final if8 loginWay;
    private final boolean tint;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final rl0 Companion = new rl0();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new jl0(4));

    /* synthetic */ AuthOption(int i, int i2, if8 if8Var, boolean z, int i3, rp3 rp3Var) {
        this(i, i2, (i3 & 4) != 0 ? null : if8Var, (i3 & 8) != 0 ? true : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        AuthOption[] authOptionArrValues = values();
        authOptionArrValues.getClass();
        return new wn2("ai.askquin.ui.account.component.AuthOption", authOptionArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getLabel() {
        return this.label;
    }

    public final if8 getLoginWay() {
        return this.loginWay;
    }

    public final boolean getTint() {
        return this.tint;
    }

    AuthOption(int i, int i2, if8 if8Var, boolean z) {
        this.icon = i;
        this.label = i2;
        this.loginWay = if8Var;
        this.tint = z;
    }
}
