package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.em7;
import defpackage.ib8;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.nzb;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zib;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\n\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute;", "", "<init>", "()V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self", "(Lai/askquin/ui/annual/ResumeRoute;Lag2;Lnyc;)V", "Companion", "MonthlyEntry", "MonthlySummary", "MonthlyDetail", "DomainEntry", "DomainSummary", "DomainDetail", "Overview", "Generating", "Drawing", "UserInfoFilling", "nzb", "Lai/askquin/ui/annual/ResumeRoute$DomainDetail;", "Lai/askquin/ui/annual/ResumeRoute$DomainEntry;", "Lai/askquin/ui/annual/ResumeRoute$DomainSummary;", "Lai/askquin/ui/annual/ResumeRoute$Drawing;", "Lai/askquin/ui/annual/ResumeRoute$Generating;", "Lai/askquin/ui/annual/ResumeRoute$MonthlyDetail;", "Lai/askquin/ui/annual/ResumeRoute$MonthlyEntry;", "Lai/askquin/ui/annual/ResumeRoute$MonthlySummary;", "Lai/askquin/ui/annual/ResumeRoute$Overview;", "Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public abstract class ResumeRoute {
    public static final int $stable = 8;
    public static final nzb Companion = new nzb();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(2));

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$DomainDetail;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DomainDetail extends ResumeRoute {
        public static final int $stable = 0;
        public static final DomainDetail INSTANCE = new DomainDetail();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(3));

        private DomainDetail() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.DomainDetail", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DomainDetail);
        }

        public int hashCode() {
            return 1642878350;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DomainDetail";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$DomainEntry;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DomainEntry extends ResumeRoute {
        public static final int $stable = 0;
        public static final DomainEntry INSTANCE = new DomainEntry();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(4));

        private DomainEntry() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.DomainEntry", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DomainEntry);
        }

        public int hashCode() {
            return 1855303573;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DomainEntry";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$DomainSummary;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DomainSummary extends ResumeRoute {
        public static final int $stable = 0;
        public static final DomainSummary INSTANCE = new DomainSummary();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(5));

        private DomainSummary() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.DomainSummary", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DomainSummary);
        }

        public int hashCode() {
            return 269226505;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DomainSummary";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$MonthlyDetail;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MonthlyDetail extends ResumeRoute {
        public static final int $stable = 0;
        public static final MonthlyDetail INSTANCE = new MonthlyDetail();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(9));

        private MonthlyDetail() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlyDetail", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MonthlyDetail);
        }

        public int hashCode() {
            return 1260020357;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MonthlyDetail";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$MonthlyEntry;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MonthlyEntry extends ResumeRoute {
        public static final int $stable = 0;
        public static final MonthlyEntry INSTANCE = new MonthlyEntry();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(10));

        private MonthlyEntry() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlyEntry", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MonthlyEntry);
        }

        public int hashCode() {
            return 596027326;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MonthlyEntry";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$MonthlySummary;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MonthlySummary extends ResumeRoute {
        public static final int $stable = 0;
        public static final MonthlySummary INSTANCE = new MonthlySummary();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(11));

        private MonthlySummary() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlySummary", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MonthlySummary);
        }

        public int hashCode() {
            return 1285530610;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MonthlySummary";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$Overview;", "Lai/askquin/ui/annual/ResumeRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Overview extends ResumeRoute {
        public static final int $stable = 0;
        public static final Overview INSTANCE = new Overview();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new zib(12));

        private Overview() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.annual.ResumeRoute.Overview", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Overview);
        }

        public int hashCode() {
            return -1303666350;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Overview";
        }
    }

    public /* synthetic */ ResumeRoute(rp3 rp3Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.annual.ResumeRoute", kobVar.b(ResumeRoute.class), new em7[]{kobVar.b(DomainDetail.class), kobVar.b(DomainEntry.class), kobVar.b(DomainSummary.class), kobVar.b(Drawing.class), kobVar.b(Generating.class), kobVar.b(MonthlyDetail.class), kobVar.b(MonthlyEntry.class), kobVar.b(MonthlySummary.class), kobVar.b(Overview.class), kobVar.b(UserInfoFilling.class)}, new xn7[]{new wn2("ai.askquin.ui.annual.ResumeRoute.DomainDetail", DomainDetail.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.annual.ResumeRoute.DomainEntry", DomainEntry.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.annual.ResumeRoute.DomainSummary", DomainSummary.INSTANCE, new Annotation[0]), i.a, k.a, new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlyDetail", MonthlyDetail.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlyEntry", MonthlyEntry.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.annual.ResumeRoute.MonthlySummary", MonthlySummary.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.annual.ResumeRoute.Overview", Overview.INSTANCE, new Annotation[0]), m.a}, new Annotation[0]);
    }

    private ResumeRoute() {
    }

    public /* synthetic */ ResumeRoute(int i, xyc xycVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$Generating;", "Lai/askquin/ui/annual/ResumeRoute;", "Lai/askquin/ui/annual/model/AnnualActionFor;", "actionFor", "<init>", "(Lai/askquin/ui/annual/model/AnnualActionFor;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/annual/model/AnnualActionFor;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/annual/ResumeRoute$Generating;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/annual/model/AnnualActionFor;", "copy", "(Lai/askquin/ui/annual/model/AnnualActionFor;)Lai/askquin/ui/annual/ResumeRoute$Generating;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/annual/model/AnnualActionFor;", "getActionFor", "Companion", "ai/askquin/ui/annual/k", "ai/askquin/ui/annual/l", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Generating extends ResumeRoute {
        public static final int $stable = 0;
        private final AnnualActionFor actionFor;
        public static final l Companion = new l();
        private static final lw7[] $childSerializers = {eb3.N(z18.b, new zib(8))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Generating(int i, AnnualActionFor annualActionFor, xyc xycVar) {
            super(i, xycVar);
            if (1 != (i & 1)) {
                an1.R(i, 1, k.a.e());
                throw null;
            }
            this.actionFor = annualActionFor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return AnnualActionFor.Companion.serializer();
        }

        public static /* synthetic */ Generating copy$default(Generating generating, AnnualActionFor annualActionFor, int i, Object obj) {
            if ((i & 1) != 0) {
                annualActionFor = generating.actionFor;
            }
            return generating.copy(annualActionFor);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(Generating self, ag2 output, nyc serialDesc) {
            ResumeRoute.write$Self(self, output, serialDesc);
            output.p(serialDesc, 0, (xn7) $childSerializers[0].getValue(), self.actionFor);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnnualActionFor getActionFor() {
            return this.actionFor;
        }

        public final Generating copy(AnnualActionFor actionFor) {
            actionFor.getClass();
            return new Generating(actionFor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Generating) && this.actionFor == ((Generating) other).actionFor;
        }

        public final AnnualActionFor getActionFor() {
            return this.actionFor;
        }

        public int hashCode() {
            return this.actionFor.hashCode();
        }

        public String toString() {
            return "Generating(actionFor=" + this.actionFor + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generating(AnnualActionFor annualActionFor) {
            super(null);
            annualActionFor.getClass();
            this.actionFor = annualActionFor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "Lai/askquin/ui/annual/ResumeRoute;", "", "nickname", "gender", "career", "relationshipStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNickname", "getGender", "getCareer", "getRelationshipStatus", "Companion", "ai/askquin/ui/annual/m", "ai/askquin/ui/annual/n", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class UserInfoFilling extends ResumeRoute {
        public static final int $stable = 0;
        public static final n Companion = new n();
        private final String career;
        private final String gender;
        private final String nickname;
        private final String relationshipStatus;

        public /* synthetic */ UserInfoFilling(int i, String str, String str2, String str3, String str4, xyc xycVar) {
            super(i, xycVar);
            if ((i & 1) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str;
            }
            if ((i & 2) == 0) {
                this.gender = null;
            } else {
                this.gender = str2;
            }
            if ((i & 4) == 0) {
                this.career = null;
            } else {
                this.career = str3;
            }
            if ((i & 8) == 0) {
                this.relationshipStatus = null;
            } else {
                this.relationshipStatus = str4;
            }
        }

        public static /* synthetic */ UserInfoFilling copy$default(UserInfoFilling userInfoFilling, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfoFilling.nickname;
            }
            if ((i & 2) != 0) {
                str2 = userInfoFilling.gender;
            }
            if ((i & 4) != 0) {
                str3 = userInfoFilling.career;
            }
            if ((i & 8) != 0) {
                str4 = userInfoFilling.relationshipStatus;
            }
            return userInfoFilling.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UserInfoFilling self, ag2 output, nyc serialDesc) {
            ResumeRoute.write$Self(self, output, serialDesc);
            if (output.g(serialDesc) || self.nickname != null) {
                output.A(serialDesc, 0, p4e.a, self.nickname);
            }
            if (output.g(serialDesc) || self.gender != null) {
                output.A(serialDesc, 1, p4e.a, self.gender);
            }
            if (output.g(serialDesc) || self.career != null) {
                output.A(serialDesc, 2, p4e.a, self.career);
            }
            if (!output.g(serialDesc) && self.relationshipStatus == null) {
                return;
            }
            output.A(serialDesc, 3, p4e.a, self.relationshipStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGender() {
            return this.gender;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCareer() {
            return this.career;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRelationshipStatus() {
            return this.relationshipStatus;
        }

        public final UserInfoFilling copy(String nickname, String gender, String career, String relationshipStatus) {
            return new UserInfoFilling(nickname, gender, career, relationshipStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfoFilling)) {
                return false;
            }
            UserInfoFilling userInfoFilling = (UserInfoFilling) other;
            return pa7.t(this.nickname, userInfoFilling.nickname) && pa7.t(this.gender, userInfoFilling.gender) && pa7.t(this.career, userInfoFilling.career) && pa7.t(this.relationshipStatus, userInfoFilling.relationshipStatus);
        }

        public final String getCareer() {
            return this.career;
        }

        public final String getGender() {
            return this.gender;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final String getRelationshipStatus() {
            return this.relationshipStatus;
        }

        public int hashCode() {
            String str = this.nickname;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gender;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.career;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.relationshipStatus;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.nickname;
            String str2 = this.gender;
            return ks0.m(ib8.o("UserInfoFilling(nickname=", str, ", gender=", str2, ", career="), this.career, ", relationshipStatus=", this.relationshipStatus, ")");
        }

        public UserInfoFilling() {
            this((String) null, (String) null, (String) null, (String) null, 15, (rp3) null);
        }

        public UserInfoFilling(String str, String str2, String str3, String str4) {
            super(null);
            this.nickname = str;
            this.gender = str2;
            this.career = str3;
            this.relationshipStatus = str4;
        }

        public /* synthetic */ UserInfoFilling(String str, String str2, String str3, String str4, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J@\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010!¨\u00068"}, d2 = {"Lai/askquin/ui/annual/ResumeRoute$Drawing;", "Lai/askquin/ui/annual/ResumeRoute;", "Lai/askquin/ui/annual/model/AnnualActionFor;", "actionFor", "", "resumeIndex", "", "Ltech/chatmind/api/TarotCardChoice;", "drawnCards", "Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "userInfo", "<init>", "(Lai/askquin/ui/annual/model/AnnualActionFor;ILjava/util/List;Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/annual/model/AnnualActionFor;ILjava/util/List;Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/annual/ResumeRoute$Drawing;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/annual/model/AnnualActionFor;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "()Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "copy", "(Lai/askquin/ui/annual/model/AnnualActionFor;ILjava/util/List;Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;)Lai/askquin/ui/annual/ResumeRoute$Drawing;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/annual/model/AnnualActionFor;", "getActionFor", "I", "getResumeIndex", "Ljava/util/List;", "getDrawnCards", "Lai/askquin/ui/annual/ResumeRoute$UserInfoFilling;", "getUserInfo", "Companion", "ai/askquin/ui/annual/i", "ai/askquin/ui/annual/j", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Drawing extends ResumeRoute {
        private static final lw7[] $childSerializers;
        public static final int $stable = 8;
        public static final j Companion = new j();
        private final AnnualActionFor actionFor;
        private final List<TarotCardChoice> drawnCards;
        private final int resumeIndex;
        private final UserInfoFilling userInfo;

        static {
            zib zibVar = new zib(6);
            z18 z18Var = z18.b;
            $childSerializers = new lw7[]{eb3.N(z18Var, zibVar), null, eb3.N(z18Var, new zib(7)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Drawing(int i, AnnualActionFor annualActionFor, int i2, List list, UserInfoFilling userInfoFilling, xyc xycVar) {
            super(i, xycVar);
            if (1 != (i & 1)) {
                an1.R(i, 1, i.a.e());
                throw null;
            }
            this.actionFor = annualActionFor;
            if ((i & 2) == 0) {
                this.resumeIndex = 0;
            } else {
                this.resumeIndex = i2;
            }
            if ((i & 4) == 0) {
                this.drawnCards = pu4.a;
            } else {
                this.drawnCards = list;
            }
            if ((i & 8) == 0) {
                this.userInfo = null;
            } else {
                this.userInfo = userInfoFilling;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return AnnualActionFor.Companion.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
            return new dd0(rhe.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Drawing copy$default(Drawing drawing, AnnualActionFor annualActionFor, int i, List list, UserInfoFilling userInfoFilling, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                annualActionFor = drawing.actionFor;
            }
            if ((i2 & 2) != 0) {
                i = drawing.resumeIndex;
            }
            if ((i2 & 4) != 0) {
                list = drawing.drawnCards;
            }
            if ((i2 & 8) != 0) {
                userInfoFilling = drawing.userInfo;
            }
            return drawing.copy(annualActionFor, i, list, userInfoFilling);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(Drawing self, ag2 output, nyc serialDesc) {
            ResumeRoute.write$Self(self, output, serialDesc);
            lw7[] lw7VarArr = $childSerializers;
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.actionFor);
            if (output.g(serialDesc) || self.resumeIndex != 0) {
                output.v(1, self.resumeIndex, serialDesc);
            }
            if (output.g(serialDesc) || !pa7.t(self.drawnCards, pu4.a)) {
                output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.drawnCards);
            }
            if (!output.g(serialDesc) && self.userInfo == null) {
                return;
            }
            output.A(serialDesc, 3, m.a, self.userInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnnualActionFor getActionFor() {
            return this.actionFor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getResumeIndex() {
            return this.resumeIndex;
        }

        public final List<TarotCardChoice> component3() {
            return this.drawnCards;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final UserInfoFilling getUserInfo() {
            return this.userInfo;
        }

        public final Drawing copy(AnnualActionFor actionFor, int resumeIndex, List<TarotCardChoice> drawnCards, UserInfoFilling userInfo) {
            actionFor.getClass();
            drawnCards.getClass();
            return new Drawing(actionFor, resumeIndex, drawnCards, userInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drawing)) {
                return false;
            }
            Drawing drawing = (Drawing) other;
            return this.actionFor == drawing.actionFor && this.resumeIndex == drawing.resumeIndex && pa7.t(this.drawnCards, drawing.drawnCards) && pa7.t(this.userInfo, drawing.userInfo);
        }

        public final AnnualActionFor getActionFor() {
            return this.actionFor;
        }

        public final List<TarotCardChoice> getDrawnCards() {
            return this.drawnCards;
        }

        public final int getResumeIndex() {
            return this.resumeIndex;
        }

        public final UserInfoFilling getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            int iA = tec.a(ub3.b(this.resumeIndex, this.actionFor.hashCode() * 31, 31), 31, this.drawnCards);
            UserInfoFilling userInfoFilling = this.userInfo;
            return iA + (userInfoFilling == null ? 0 : userInfoFilling.hashCode());
        }

        public String toString() {
            return "Drawing(actionFor=" + this.actionFor + ", resumeIndex=" + this.resumeIndex + ", drawnCards=" + this.drawnCards + ", userInfo=" + this.userInfo + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drawing(AnnualActionFor annualActionFor, int i, List<TarotCardChoice> list, UserInfoFilling userInfoFilling) {
            super(null);
            annualActionFor.getClass();
            list.getClass();
            this.actionFor = annualActionFor;
            this.resumeIndex = i;
            this.drawnCards = list;
            this.userInfo = userInfoFilling;
        }

        public /* synthetic */ Drawing(AnnualActionFor annualActionFor, int i, List list, UserInfoFilling userInfoFilling, int i2, rp3 rp3Var) {
            this(annualActionFor, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? pu4.a : list, (i2 & 8) != 0 ? null : userInfoFilling);
        }
    }

    public static final /* synthetic */ void write$Self(ResumeRoute self, ag2 output, nyc serialDesc) {
    }
}
