package ai.askquin.ui.account.navigation;

import ai.askquin.ui.account.component.AuthOption;
import defpackage.an1;
import defpackage.eb3;
import defpackage.jl0;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.lw7;
import defpackage.ql0;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"ai/askquin/ui/account/navigation/AuthNavigation$BindPhoneRoute", "Lql0;", "Lai/askquin/ui/account/component/AuthOption;", "signOption", "<init>", "(Lai/askquin/ui/account/component/AuthOption;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/account/component/AuthOption;Lxyc;)V", "Lai/askquin/ui/account/navigation/AuthNavigation$BindPhoneRoute;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_account_release", "(Lai/askquin/ui/account/navigation/AuthNavigation$BindPhoneRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/account/component/AuthOption;", "copy", "(Lai/askquin/ui/account/component/AuthOption;)Lai/askquin/ui/account/navigation/AuthNavigation$BindPhoneRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/account/component/AuthOption;", "getSignOption", "Companion", "kl0", "ll0", "Quin.component:account_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AuthNavigation$BindPhoneRoute implements ql0 {
    public static final int $stable = 0;
    private final AuthOption signOption;
    public static final ll0 Companion = new ll0();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new jl0(1))};

    public /* synthetic */ AuthNavigation$BindPhoneRoute(int i, AuthOption authOption, xyc xycVar) {
        if (1 == (i & 1)) {
            this.signOption = authOption;
        } else {
            an1.R(i, 1, kl0.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return AuthOption.Companion.serializer();
    }

    public static /* synthetic */ AuthNavigation$BindPhoneRoute copy$default(AuthNavigation$BindPhoneRoute authNavigation$BindPhoneRoute, AuthOption authOption, int i, Object obj) {
        if ((i & 1) != 0) {
            authOption = authNavigation$BindPhoneRoute.signOption;
        }
        return authNavigation$BindPhoneRoute.copy(authOption);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthOption getSignOption() {
        return this.signOption;
    }

    public final AuthNavigation$BindPhoneRoute copy(AuthOption signOption) {
        signOption.getClass();
        return new AuthNavigation$BindPhoneRoute(signOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthNavigation$BindPhoneRoute) && this.signOption == ((AuthNavigation$BindPhoneRoute) other).signOption;
    }

    public final AuthOption getSignOption() {
        return this.signOption;
    }

    public int hashCode() {
        return this.signOption.hashCode();
    }

    public String toString() {
        return "BindPhoneRoute(signOption=" + this.signOption + ")";
    }

    public AuthNavigation$BindPhoneRoute(AuthOption authOption) {
        authOption.getClass();
        this.signOption = authOption;
    }
}
