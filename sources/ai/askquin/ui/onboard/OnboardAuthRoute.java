package ai.askquin.ui.onboard;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.on9;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)*B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lai/askquin/ui/onboard/OnboardAuthRoute;", "", "", "fromWelcomeLogin", "afterFirstReading", "showBack", "<init>", "(ZZZ)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/onboard/OnboardAuthRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lai/askquin/ui/onboard/OnboardAuthRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getFromWelcomeLogin", "getAfterFirstReading", "getShowBack", "Companion", "nn9", "on9", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class OnboardAuthRoute {
    public static final int $stable = 0;
    public static final on9 Companion = new on9();
    private final boolean afterFirstReading;
    private final boolean fromWelcomeLogin;
    private final boolean showBack;

    public /* synthetic */ OnboardAuthRoute(int i, boolean z, boolean z2, boolean z3, xyc xycVar) {
        if ((i & 1) == 0) {
            this.fromWelcomeLogin = false;
        } else {
            this.fromWelcomeLogin = z;
        }
        if ((i & 2) == 0) {
            this.afterFirstReading = false;
        } else {
            this.afterFirstReading = z2;
        }
        if ((i & 4) == 0) {
            this.showBack = true;
        } else {
            this.showBack = z3;
        }
    }

    public static /* synthetic */ OnboardAuthRoute copy$default(OnboardAuthRoute onboardAuthRoute, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onboardAuthRoute.fromWelcomeLogin;
        }
        if ((i & 2) != 0) {
            z2 = onboardAuthRoute.afterFirstReading;
        }
        if ((i & 4) != 0) {
            z3 = onboardAuthRoute.showBack;
        }
        return onboardAuthRoute.copy(z, z2, z3);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(OnboardAuthRoute self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.fromWelcomeLogin) {
            output.o(serialDesc, 0, self.fromWelcomeLogin);
        }
        if (output.g(serialDesc) || self.afterFirstReading) {
            output.o(serialDesc, 1, self.afterFirstReading);
        }
        if (!output.g(serialDesc) && self.showBack) {
            return;
        }
        output.o(serialDesc, 2, self.showBack);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFromWelcomeLogin() {
        return this.fromWelcomeLogin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAfterFirstReading() {
        return this.afterFirstReading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowBack() {
        return this.showBack;
    }

    public final OnboardAuthRoute copy(boolean fromWelcomeLogin, boolean afterFirstReading, boolean showBack) {
        return new OnboardAuthRoute(fromWelcomeLogin, afterFirstReading, showBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardAuthRoute)) {
            return false;
        }
        OnboardAuthRoute onboardAuthRoute = (OnboardAuthRoute) other;
        return this.fromWelcomeLogin == onboardAuthRoute.fromWelcomeLogin && this.afterFirstReading == onboardAuthRoute.afterFirstReading && this.showBack == onboardAuthRoute.showBack;
    }

    public final boolean getAfterFirstReading() {
        return this.afterFirstReading;
    }

    public final boolean getFromWelcomeLogin() {
        return this.fromWelcomeLogin;
    }

    public final boolean getShowBack() {
        return this.showBack;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBack) + ub3.d(Boolean.hashCode(this.fromWelcomeLogin) * 31, 31, this.afterFirstReading);
    }

    public String toString() {
        boolean z = this.fromWelcomeLogin;
        boolean z2 = this.afterFirstReading;
        return ub3.m(ib8.p("OnboardAuthRoute(fromWelcomeLogin=", ", afterFirstReading=", ", showBack=", z, z2), this.showBack, ")");
    }

    public OnboardAuthRoute() {
        this(false, false, false, 7, (rp3) null);
    }

    public OnboardAuthRoute(boolean z, boolean z2, boolean z3) {
        this.fromWelcomeLogin = z;
        this.afterFirstReading = z2;
        this.showBack = z3;
    }

    public /* synthetic */ OnboardAuthRoute(boolean z, boolean z2, boolean z3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3);
    }
}
