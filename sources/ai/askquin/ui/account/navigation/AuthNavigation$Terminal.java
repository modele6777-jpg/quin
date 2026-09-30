package ai.askquin.ui.account.navigation;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nyc;
import defpackage.ol0;
import defpackage.pa7;
import defpackage.pl0;
import defpackage.ql0;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u001a¨\u0006*"}, d2 = {"ai/askquin/ui/account/navigation/AuthNavigation$Terminal", "Lql0;", "", "isNewUser", "", "method", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLjava/lang/String;Lxyc;)V", "Lai/askquin/ui/account/navigation/AuthNavigation$Terminal;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_account_release", "(Lai/askquin/ui/account/navigation/AuthNavigation$Terminal;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lai/askquin/ui/account/navigation/AuthNavigation$Terminal;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getMethod", "Companion", "ol0", "pl0", "Quin.component:account_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AuthNavigation$Terminal implements ql0 {
    public static final int $stable = 0;
    public static final pl0 Companion = new pl0();
    private final boolean isNewUser;
    private final String method;

    public /* synthetic */ AuthNavigation$Terminal(int i, boolean z, String str, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, ol0.a.e());
            throw null;
        }
        this.isNewUser = z;
        this.method = str;
    }

    public static /* synthetic */ AuthNavigation$Terminal copy$default(AuthNavigation$Terminal authNavigation$Terminal, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authNavigation$Terminal.isNewUser;
        }
        if ((i & 2) != 0) {
            str = authNavigation$Terminal.method;
        }
        return authNavigation$Terminal.copy(z, str);
    }

    public static final /* synthetic */ void write$Self$Quin_component_account_release(AuthNavigation$Terminal self, ag2 output, nyc serialDesc) {
        output.o(serialDesc, 0, self.isNewUser);
        output.w(serialDesc, 1, self.method);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final AuthNavigation$Terminal copy(boolean isNewUser, String method) {
        method.getClass();
        return new AuthNavigation$Terminal(isNewUser, method);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthNavigation$Terminal)) {
            return false;
        }
        AuthNavigation$Terminal authNavigation$Terminal = (AuthNavigation$Terminal) other;
        return this.isNewUser == authNavigation$Terminal.isNewUser && pa7.t(this.method, authNavigation$Terminal.method);
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode() + (Boolean.hashCode(this.isNewUser) * 31);
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public String toString() {
        return "Terminal(isNewUser=" + this.isNewUser + ", method=" + this.method + ")";
    }

    public AuthNavigation$Terminal(boolean z, String str) {
        str.getClass();
        this.isNewUser = z;
        this.method = str;
    }
}
