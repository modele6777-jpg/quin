package ai.askquin.ui.onboard;

import defpackage.an1;
import defpackage.bp9;
import defpackage.cp9;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0015¨\u0006$"}, d2 = {"Lai/askquin/ui/onboard/OnboardNotificationRoute;", "", "", "isNewUser", "<init>", "(Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/onboard/OnboardNotificationRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lai/askquin/ui/onboard/OnboardNotificationRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "bp9", "cp9", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class OnboardNotificationRoute {
    public static final int $stable = 0;
    public static final cp9 Companion = new cp9();
    private final boolean isNewUser;

    public /* synthetic */ OnboardNotificationRoute(int i, boolean z, xyc xycVar) {
        if (1 == (i & 1)) {
            this.isNewUser = z;
        } else {
            an1.R(i, 1, bp9.a.e());
            throw null;
        }
    }

    public static /* synthetic */ OnboardNotificationRoute copy$default(OnboardNotificationRoute onboardNotificationRoute, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onboardNotificationRoute.isNewUser;
        }
        return onboardNotificationRoute.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    public final OnboardNotificationRoute copy(boolean isNewUser) {
        return new OnboardNotificationRoute(isNewUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnboardNotificationRoute) && this.isNewUser == ((OnboardNotificationRoute) other).isNewUser;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNewUser);
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public String toString() {
        return "OnboardNotificationRoute(isNewUser=" + this.isNewUser + ")";
    }

    public OnboardNotificationRoute(boolean z) {
        this.isNewUser = z;
    }
}
