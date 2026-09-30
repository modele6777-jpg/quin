package ai.askquin.ui.paywall;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.iif;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.qc0;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uzd;
import defpackage.vy9;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute;", "", "Companion", "ai/askquin/ui/paywall/g", "Congratulation", "UpgradeWaring", "Paywall520", "UpgradePaywall", "AddonPaywall", "InterceptPaywall", "Lai/askquin/ui/paywall/PaywallRoute$AddonPaywall;", "Lai/askquin/ui/paywall/PaywallRoute$Congratulation;", "Lai/askquin/ui/paywall/PaywallRoute$InterceptPaywall;", "Lai/askquin/ui/paywall/PaywallRoute$Paywall520;", "Lai/askquin/ui/paywall/PaywallRoute$UpgradePaywall;", "Lai/askquin/ui/paywall/PaywallRoute$UpgradeWaring;", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface PaywallRoute {
    public static final g Companion = g.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$Paywall520;", "Lai/askquin/ui/paywall/PaywallRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Paywall520 implements PaywallRoute {
        public static final int $stable = 0;
        public static final Paywall520 INSTANCE = new Paywall520();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new vy9(11));

        private Paywall520() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.paywall.PaywallRoute.Paywall520", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Paywall520);
        }

        public int hashCode() {
            return 482147508;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Paywall520";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$UpgradeWaring;", "Lai/askquin/ui/paywall/PaywallRoute;", "", "forSpread", "<init>", "(Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_paywall_release", "(Lai/askquin/ui/paywall/PaywallRoute$UpgradeWaring;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lai/askquin/ui/paywall/PaywallRoute$UpgradeWaring;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getForSpread", "Companion", "ai/askquin/ui/paywall/n", "ai/askquin/ui/paywall/o", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class UpgradeWaring implements PaywallRoute {
        public static final int $stable = 0;
        public static final o Companion = new o();
        private final boolean forSpread;

        public /* synthetic */ UpgradeWaring(int i, boolean z, xyc xycVar) {
            if ((i & 1) == 0) {
                this.forSpread = false;
            } else {
                this.forSpread = z;
            }
        }

        public static /* synthetic */ UpgradeWaring copy$default(UpgradeWaring upgradeWaring, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = upgradeWaring.forSpread;
            }
            return upgradeWaring.copy(z);
        }

        public static final /* synthetic */ void write$Self$Quin_component_paywall_release(UpgradeWaring self, ag2 output, nyc serialDesc) {
            if (output.g(serialDesc) || self.forSpread) {
                output.o(serialDesc, 0, self.forSpread);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getForSpread() {
            return this.forSpread;
        }

        public final UpgradeWaring copy(boolean forSpread) {
            return new UpgradeWaring(forSpread);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpgradeWaring) && this.forSpread == ((UpgradeWaring) other).forSpread;
        }

        public final boolean getForSpread() {
            return this.forSpread;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forSpread);
        }

        public String toString() {
            return "UpgradeWaring(forSpread=" + this.forSpread + ")";
        }

        public UpgradeWaring() {
            this(false, 1, (rp3) null);
        }

        public UpgradeWaring(boolean z) {
            this.forSpread = z;
        }

        public /* synthetic */ UpgradeWaring(boolean z, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$Congratulation;", "Lai/askquin/ui/paywall/PaywallRoute;", "", "showWeComQrCode", "wasSubscription", "<init>", "(ZZ)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_paywall_release", "(Lai/askquin/ui/paywall/PaywallRoute$Congratulation;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lai/askquin/ui/paywall/PaywallRoute$Congratulation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowWeComQrCode", "getWasSubscription", "Companion", "ai/askquin/ui/paywall/h", "ai/askquin/ui/paywall/i", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Congratulation implements PaywallRoute {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final boolean showWeComQrCode;
        private final boolean wasSubscription;

        public /* synthetic */ Congratulation(int i, boolean z, boolean z2, xyc xycVar) {
            if ((i & 1) == 0) {
                this.showWeComQrCode = false;
            } else {
                this.showWeComQrCode = z;
            }
            if ((i & 2) == 0) {
                this.wasSubscription = false;
            } else {
                this.wasSubscription = z2;
            }
        }

        public static /* synthetic */ Congratulation copy$default(Congratulation congratulation, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = congratulation.showWeComQrCode;
            }
            if ((i & 2) != 0) {
                z2 = congratulation.wasSubscription;
            }
            return congratulation.copy(z, z2);
        }

        public static final /* synthetic */ void write$Self$Quin_component_paywall_release(Congratulation self, ag2 output, nyc serialDesc) {
            if (output.g(serialDesc) || self.showWeComQrCode) {
                output.o(serialDesc, 0, self.showWeComQrCode);
            }
            if (output.g(serialDesc) || self.wasSubscription) {
                output.o(serialDesc, 1, self.wasSubscription);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowWeComQrCode() {
            return this.showWeComQrCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getWasSubscription() {
            return this.wasSubscription;
        }

        public final Congratulation copy(boolean showWeComQrCode, boolean wasSubscription) {
            return new Congratulation(showWeComQrCode, wasSubscription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Congratulation)) {
                return false;
            }
            Congratulation congratulation = (Congratulation) other;
            return this.showWeComQrCode == congratulation.showWeComQrCode && this.wasSubscription == congratulation.wasSubscription;
        }

        public final boolean getShowWeComQrCode() {
            return this.showWeComQrCode;
        }

        public final boolean getWasSubscription() {
            return this.wasSubscription;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasSubscription) + (Boolean.hashCode(this.showWeComQrCode) * 31);
        }

        public String toString() {
            return "Congratulation(showWeComQrCode=" + this.showWeComQrCode + ", wasSubscription=" + this.wasSubscription + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Congratulation() {
            boolean z = false;
            this(z, z, 3, (rp3) null);
        }

        public Congratulation(boolean z, boolean z2) {
            this.showWeComQrCode = z;
            this.wasSubscription = z2;
        }

        public /* synthetic */ Congratulation(boolean z, boolean z2, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$AddonPaywall;", "Lai/askquin/ui/paywall/PaywallRoute;", "", "source", "blockedReason", "resultKey", "", "armDailyFortuneGuideOnDismiss", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_paywall_release", "(Lai/askquin/ui/paywall/PaywallRoute$AddonPaywall;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lai/askquin/ui/paywall/PaywallRoute$AddonPaywall;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getBlockedReason", "getResultKey", "Z", "getArmDailyFortuneGuideOnDismiss", "Companion", "ai/askquin/ui/paywall/e", "ai/askquin/ui/paywall/f", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class AddonPaywall implements PaywallRoute {
        public static final int $stable = 0;
        public static final f Companion = new f();
        private final boolean armDailyFortuneGuideOnDismiss;
        private final String blockedReason;
        private final String resultKey;
        private final String source;

        public /* synthetic */ AddonPaywall(int i, String str, String str2, String str3, boolean z, xyc xycVar) {
            this.source = (i & 1) == 0 ? "unknown" : str;
            if ((i & 2) == 0) {
                this.blockedReason = null;
            } else {
                this.blockedReason = str2;
            }
            if ((i & 4) == 0) {
                this.resultKey = "paywall_unlock_reading";
            } else {
                this.resultKey = str3;
            }
            if ((i & 8) == 0) {
                this.armDailyFortuneGuideOnDismiss = false;
            } else {
                this.armDailyFortuneGuideOnDismiss = z;
            }
        }

        public static /* synthetic */ AddonPaywall copy$default(AddonPaywall addonPaywall, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addonPaywall.source;
            }
            if ((i & 2) != 0) {
                str2 = addonPaywall.blockedReason;
            }
            if ((i & 4) != 0) {
                str3 = addonPaywall.resultKey;
            }
            if ((i & 8) != 0) {
                z = addonPaywall.armDailyFortuneGuideOnDismiss;
            }
            return addonPaywall.copy(str, str2, str3, z);
        }

        public static final /* synthetic */ void write$Self$Quin_component_paywall_release(AddonPaywall self, ag2 output, nyc serialDesc) {
            if (output.g(serialDesc) || !pa7.t(self.source, "unknown")) {
                output.w(serialDesc, 0, self.source);
            }
            if (output.g(serialDesc) || self.blockedReason != null) {
                output.A(serialDesc, 1, p4e.a, self.blockedReason);
            }
            if (output.g(serialDesc) || !pa7.t(self.resultKey, "paywall_unlock_reading")) {
                output.w(serialDesc, 2, self.resultKey);
            }
            if (output.g(serialDesc) || self.armDailyFortuneGuideOnDismiss) {
                output.o(serialDesc, 3, self.armDailyFortuneGuideOnDismiss);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBlockedReason() {
            return this.blockedReason;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getResultKey() {
            return this.resultKey;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getArmDailyFortuneGuideOnDismiss() {
            return this.armDailyFortuneGuideOnDismiss;
        }

        public final AddonPaywall copy(String source, String blockedReason, String resultKey, boolean armDailyFortuneGuideOnDismiss) {
            source.getClass();
            resultKey.getClass();
            return new AddonPaywall(source, blockedReason, resultKey, armDailyFortuneGuideOnDismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddonPaywall)) {
                return false;
            }
            AddonPaywall addonPaywall = (AddonPaywall) other;
            return pa7.t(this.source, addonPaywall.source) && pa7.t(this.blockedReason, addonPaywall.blockedReason) && pa7.t(this.resultKey, addonPaywall.resultKey) && this.armDailyFortuneGuideOnDismiss == addonPaywall.armDailyFortuneGuideOnDismiss;
        }

        public final boolean getArmDailyFortuneGuideOnDismiss() {
            return this.armDailyFortuneGuideOnDismiss;
        }

        public final String getBlockedReason() {
            return this.blockedReason;
        }

        public final String getResultKey() {
            return this.resultKey;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            String str = this.blockedReason;
            return Boolean.hashCode(this.armDailyFortuneGuideOnDismiss) + ub3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.resultKey);
        }

        public String toString() {
            String str = this.source;
            String str2 = this.blockedReason;
            String str3 = this.resultKey;
            boolean z = this.armDailyFortuneGuideOnDismiss;
            StringBuilder sbO = ib8.o("AddonPaywall(source=", str, ", blockedReason=", str2, ", resultKey=");
            sbO.append(str3);
            sbO.append(", armDailyFortuneGuideOnDismiss=");
            sbO.append(z);
            sbO.append(")");
            return sbO.toString();
        }

        public AddonPaywall() {
            this((String) null, (String) null, (String) null, false, 15, (rp3) null);
        }

        public AddonPaywall(String str, String str2, String str3, boolean z) {
            str.getClass();
            str3.getClass();
            this.source = str;
            this.blockedReason = str2;
            this.resultKey = str3;
            this.armDailyFortuneGuideOnDismiss = z;
        }

        public /* synthetic */ AddonPaywall(String str, String str2, String str3, boolean z, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "paywall_unlock_reading" : str3, (i & 8) != 0 ? false : z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019R\u0011\u0010.\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$InterceptPaywall;", "Lai/askquin/ui/paywall/PaywallRoute;", "", "source", "blockedReason", "resultKey", "accountId", "readingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_paywall_release", "(Lai/askquin/ui/paywall/PaywallRoute$InterceptPaywall;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/paywall/PaywallRoute$InterceptPaywall;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getBlockedReason", "getResultKey", "getAccountId", "getReadingId", "isFollowUpRestricted", "()Z", "Companion", "ai/askquin/ui/paywall/j", "ai/askquin/ui/paywall/k", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class InterceptPaywall implements PaywallRoute {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final String accountId;
        private final String blockedReason;
        private final String readingId;
        private final String resultKey;
        private final String source;

        public /* synthetic */ InterceptPaywall(int i, String str, String str2, String str3, String str4, String str5, xyc xycVar) {
            this.source = (i & 1) == 0 ? "conversation" : str;
            if ((i & 2) == 0) {
                this.blockedReason = null;
            } else {
                this.blockedReason = str2;
            }
            if ((i & 4) == 0) {
                this.resultKey = "paywall_unlock_reading";
            } else {
                this.resultKey = str3;
            }
            if ((i & 8) == 0) {
                this.accountId = null;
            } else {
                this.accountId = str4;
            }
            if ((i & 16) == 0) {
                this.readingId = null;
            } else {
                this.readingId = str5;
            }
        }

        public static /* synthetic */ InterceptPaywall copy$default(InterceptPaywall interceptPaywall, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = interceptPaywall.source;
            }
            if ((i & 2) != 0) {
                str2 = interceptPaywall.blockedReason;
            }
            if ((i & 4) != 0) {
                str3 = interceptPaywall.resultKey;
            }
            if ((i & 8) != 0) {
                str4 = interceptPaywall.accountId;
            }
            if ((i & 16) != 0) {
                str5 = interceptPaywall.readingId;
            }
            String str6 = str5;
            String str7 = str3;
            return interceptPaywall.copy(str, str2, str7, str4, str6);
        }

        public static final /* synthetic */ void write$Self$Quin_component_paywall_release(InterceptPaywall self, ag2 output, nyc serialDesc) {
            if (output.g(serialDesc) || !pa7.t(self.source, "conversation")) {
                output.w(serialDesc, 0, self.source);
            }
            if (output.g(serialDesc) || self.blockedReason != null) {
                output.A(serialDesc, 1, p4e.a, self.blockedReason);
            }
            if (output.g(serialDesc) || !pa7.t(self.resultKey, "paywall_unlock_reading")) {
                output.w(serialDesc, 2, self.resultKey);
            }
            if (output.g(serialDesc) || self.accountId != null) {
                output.A(serialDesc, 3, p4e.a, self.accountId);
            }
            if (!output.g(serialDesc) && self.readingId == null) {
                return;
            }
            output.A(serialDesc, 4, p4e.a, self.readingId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBlockedReason() {
            return this.blockedReason;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getResultKey() {
            return this.resultKey;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getReadingId() {
            return this.readingId;
        }

        public final InterceptPaywall copy(String source, String blockedReason, String resultKey, String accountId, String readingId) {
            source.getClass();
            resultKey.getClass();
            return new InterceptPaywall(source, blockedReason, resultKey, accountId, readingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InterceptPaywall)) {
                return false;
            }
            InterceptPaywall interceptPaywall = (InterceptPaywall) other;
            return pa7.t(this.source, interceptPaywall.source) && pa7.t(this.blockedReason, interceptPaywall.blockedReason) && pa7.t(this.resultKey, interceptPaywall.resultKey) && pa7.t(this.accountId, interceptPaywall.accountId) && pa7.t(this.readingId, interceptPaywall.readingId);
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getBlockedReason() {
            return this.blockedReason;
        }

        public final String getReadingId() {
            return this.readingId;
        }

        public final String getResultKey() {
            return this.resultKey;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            String str = this.blockedReason;
            int iC = ub3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.resultKey);
            String str2 = this.accountId;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.readingId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isFollowUpRestricted() {
            String str = this.blockedReason;
            iif.a.getClass();
            return uzd.d(str) == iif.NoSubscription;
        }

        public String toString() {
            String str = this.source;
            String str2 = this.blockedReason;
            String str3 = this.resultKey;
            String str4 = this.accountId;
            String str5 = this.readingId;
            StringBuilder sbO = ib8.o("InterceptPaywall(source=", str, ", blockedReason=", str2, ", resultKey=");
            ub3.v(sbO, str3, ", accountId=", str4, ", readingId=");
            return ks0.l(sbO, str5, ")");
        }

        public InterceptPaywall() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (rp3) null);
        }

        public InterceptPaywall(String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str3.getClass();
            this.source = str;
            this.blockedReason = str2;
            this.resultKey = str3;
            this.accountId = str4;
            this.readingId = str5;
        }

        public /* synthetic */ InterceptPaywall(String str, String str2, String str3, String str4, String str5, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? "conversation" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "paywall_unlock_reading" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b\u0005\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"¨\u00066"}, d2 = {"Lai/askquin/ui/paywall/PaywallRoute$UpgradePaywall;", "Lai/askquin/ui/paywall/PaywallRoute;", "", "remainingReadings", "", "isPreview", "", "accountId", "readingId", "", "orderIds", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_component_paywall_release", "(Lai/askquin/ui/paywall/PaywallRoute$UpgradePaywall;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "copy", "(IZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lai/askquin/ui/paywall/PaywallRoute$UpgradePaywall;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRemainingReadings", "Z", "Ljava/lang/String;", "getAccountId", "getReadingId", "Ljava/util/List;", "getOrderIds", "Companion", "ai/askquin/ui/paywall/l", "ai/askquin/ui/paywall/m", "Quin.component:paywall_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class UpgradePaywall implements PaywallRoute {
        public static final int $stable = 8;
        private final String accountId;
        private final boolean isPreview;
        private final List<String> orderIds;
        private final String readingId;
        private final int remainingReadings;
        public static final m Companion = new m();
        private static final lw7[] $childSerializers = {null, null, null, null, eb3.N(z18.b, new vy9(12))};

        public /* synthetic */ UpgradePaywall(int i, int i2, boolean z, String str, String str2, List list, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, l.a.e());
                throw null;
            }
            this.remainingReadings = i2;
            this.isPreview = (i & 2) == 0 ? false : z;
            if ((i & 4) == 0) {
                this.accountId = null;
            } else {
                this.accountId = str;
            }
            if ((i & 8) == 0) {
                this.readingId = null;
            } else {
                this.readingId = str2;
            }
            if ((i & 16) == 0) {
                this.orderIds = pu4.a;
            } else {
                this.orderIds = list;
            }
            if (i2 < 0 || i2 >= 2) {
                qc0.j("Failed requirement.");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(p4e.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpgradePaywall copy$default(UpgradePaywall upgradePaywall, int i, boolean z, String str, String str2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = upgradePaywall.remainingReadings;
            }
            if ((i2 & 2) != 0) {
                z = upgradePaywall.isPreview;
            }
            if ((i2 & 4) != 0) {
                str = upgradePaywall.accountId;
            }
            if ((i2 & 8) != 0) {
                str2 = upgradePaywall.readingId;
            }
            if ((i2 & 16) != 0) {
                list = upgradePaywall.orderIds;
            }
            List list2 = list;
            String str3 = str;
            return upgradePaywall.copy(i, z, str3, str2, list2);
        }

        public static final /* synthetic */ void write$Self$Quin_component_paywall_release(UpgradePaywall self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.v(0, self.remainingReadings, serialDesc);
            if (output.g(serialDesc) || self.isPreview) {
                output.o(serialDesc, 1, self.isPreview);
            }
            if (output.g(serialDesc) || self.accountId != null) {
                output.A(serialDesc, 2, p4e.a, self.accountId);
            }
            if (output.g(serialDesc) || self.readingId != null) {
                output.A(serialDesc, 3, p4e.a, self.readingId);
            }
            if (!output.g(serialDesc) && pa7.t(self.orderIds, pu4.a)) {
                return;
            }
            output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.orderIds);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRemainingReadings() {
            return this.remainingReadings;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsPreview() {
            return this.isPreview;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReadingId() {
            return this.readingId;
        }

        public final List<String> component5() {
            return this.orderIds;
        }

        public final UpgradePaywall copy(int remainingReadings, boolean isPreview, String accountId, String readingId, List<String> orderIds) {
            orderIds.getClass();
            return new UpgradePaywall(remainingReadings, isPreview, accountId, readingId, orderIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpgradePaywall)) {
                return false;
            }
            UpgradePaywall upgradePaywall = (UpgradePaywall) other;
            return this.remainingReadings == upgradePaywall.remainingReadings && this.isPreview == upgradePaywall.isPreview && pa7.t(this.accountId, upgradePaywall.accountId) && pa7.t(this.readingId, upgradePaywall.readingId) && pa7.t(this.orderIds, upgradePaywall.orderIds);
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final List<String> getOrderIds() {
            return this.orderIds;
        }

        public final String getReadingId() {
            return this.readingId;
        }

        public final int getRemainingReadings() {
            return this.remainingReadings;
        }

        public int hashCode() {
            int iD = ub3.d(Integer.hashCode(this.remainingReadings) * 31, 31, this.isPreview);
            String str = this.accountId;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.readingId;
            return this.orderIds.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final boolean isPreview() {
            return this.isPreview;
        }

        public String toString() {
            int i = this.remainingReadings;
            boolean z = this.isPreview;
            String str = this.accountId;
            String str2 = this.readingId;
            List<String> list = this.orderIds;
            StringBuilder sb = new StringBuilder("UpgradePaywall(remainingReadings=");
            sb.append(i);
            sb.append(", isPreview=");
            sb.append(z);
            sb.append(", accountId=");
            ub3.v(sb, str, ", readingId=", str2, ", orderIds=");
            return ks0.n(sb, list, ")");
        }

        public UpgradePaywall(int i, boolean z, String str, String str2, List<String> list) {
            list.getClass();
            this.remainingReadings = i;
            this.isPreview = z;
            this.accountId = str;
            this.readingId = str2;
            this.orderIds = list;
            if (i < 0 || i >= 2) {
                qc0.j("Failed requirement.");
                throw null;
            }
        }

        public /* synthetic */ UpgradePaywall(int i, boolean z, String str, String str2, List list, int i2, rp3 rp3Var) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? pu4.a : list);
        }
    }
}
