package ai.askquin.ui.account.navigation;

import defpackage.eb3;
import defpackage.jl0;
import defpackage.lw7;
import defpackage.ql0;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ai/askquin/ui/account/navigation/AuthNavigation$EnterCodeRoute", "Lql0;", "<init>", "()V", "Lxn7;", "Lai/askquin/ui/account/navigation/AuthNavigation$EnterCodeRoute;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin.component:account_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AuthNavigation$EnterCodeRoute implements ql0 {
    public static final int $stable = 0;
    public static final AuthNavigation$EnterCodeRoute INSTANCE = new AuthNavigation$EnterCodeRoute();
    private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new jl0(3));

    private AuthNavigation$EnterCodeRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _init_$_anonymous_() {
        return new wn2("ai.askquin.ui.account.navigation.AuthNavigation.EnterCodeRoute", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ xn7 get$cachedSerializer() {
        return (xn7) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof AuthNavigation$EnterCodeRoute);
    }

    public int hashCode() {
        return -1047514459;
    }

    public final xn7 serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "EnterCodeRoute";
    }
}
