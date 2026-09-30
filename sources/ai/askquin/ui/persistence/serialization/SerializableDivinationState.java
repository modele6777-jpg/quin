package ai.askquin.ui.persistence.serialization;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.aja;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.f1d;
import defpackage.g11;
import defpackage.g2a;
import defpackage.gpc;
import defpackage.ib8;
import defpackage.job;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yia;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "", "Companion", "WaitQuestion", "WaitQuickDrawSpread", "DrawnCardsAwaitingQuestion", "Patternable", "WaitConfirm", "WaitAdditionalInfo", "Analysis", "CardsDecided", "PhotoTarot", "CardsExplanation", "ai/askquin/ui/persistence/serialization/j", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsDecided;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsExplanation;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$DrawnCardsAwaitingQuestion;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$PhotoTarot;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuestion;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuickDrawSpread;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface SerializableDivinationState {
    public static final j Companion = j.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$DrawnCardsAwaitingQuestion;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DrawnCardsAwaitingQuestion implements SerializableDivinationState {
        public static final int $stable = 0;
        public static final DrawnCardsAwaitingQuestion INSTANCE = new DrawnCardsAwaitingQuestion();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new gpc(16));

        private DrawnCardsAwaitingQuestion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.persistence.serialization.SerializableDivinationState.DrawnCardsAwaitingQuestion", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DrawnCardsAwaitingQuestion);
        }

        public int hashCode() {
            return -1493465701;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DrawnCardsAwaitingQuestion";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "Companion", "ai/askquin/ui/persistence/serialization/k", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitAdditionalInfo;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public interface Patternable extends SerializableDivinationState {
        public static final k Companion = k.a;
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuestion;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WaitQuestion implements SerializableDivinationState {
        public static final int $stable = 0;
        public static final WaitQuestion INSTANCE = new WaitQuestion();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new gpc(18));

        private WaitQuestion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.persistence.serialization.SerializableDivinationState.WaitQuestion", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WaitQuestion);
        }

        public int hashCode() {
            return -2078979253;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WaitQuestion";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuickDrawSpread;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "", "selectedSpreadId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuickDrawSpread;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitQuickDrawSpread;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectedSpreadId", "Companion", "ai/askquin/ui/persistence/serialization/r", "ai/askquin/ui/persistence/serialization/s", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WaitQuickDrawSpread implements SerializableDivinationState {
        public static final int $stable = 0;
        public static final s Companion = new s();
        private final String selectedSpreadId;

        public /* synthetic */ WaitQuickDrawSpread(int i, String str, xyc xycVar) {
            if ((i & 1) == 0) {
                this.selectedSpreadId = null;
            } else {
                this.selectedSpreadId = str;
            }
        }

        public static /* synthetic */ WaitQuickDrawSpread copy$default(WaitQuickDrawSpread waitQuickDrawSpread, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = waitQuickDrawSpread.selectedSpreadId;
            }
            return waitQuickDrawSpread.copy(str);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(WaitQuickDrawSpread self, ag2 output, nyc serialDesc) {
            if (!output.g(serialDesc) && self.selectedSpreadId == null) {
                return;
            }
            output.A(serialDesc, 0, p4e.a, self.selectedSpreadId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelectedSpreadId() {
            return this.selectedSpreadId;
        }

        public final WaitQuickDrawSpread copy(String selectedSpreadId) {
            return new WaitQuickDrawSpread(selectedSpreadId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WaitQuickDrawSpread) && pa7.t(this.selectedSpreadId, ((WaitQuickDrawSpread) other).selectedSpreadId);
        }

        public final String getSelectedSpreadId() {
            return this.selectedSpreadId;
        }

        public int hashCode() {
            String str = this.selectedSpreadId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ib8.j("WaitQuickDrawSpread(selectedSpreadId=", this.selectedSpreadId, ")");
        }

        public WaitQuickDrawSpread() {
            this((String) null, 1, (rp3) (0 == true ? 1 : 0));
        }

        public WaitQuickDrawSpread(String str) {
            this.selectedSpreadId = str;
        }

        public /* synthetic */ WaitQuickDrawSpread(String str, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b>\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b?\u0010\u001f¨\u0006C"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "", "question", "pattern", "", "Ltech/chatmind/api/PatternData;", "patternData", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "prev", "Lf1d;", "source", "aid", "spreadId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;Lf1d;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;Lf1d;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "component5", "()Lf1d;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;Lf1d;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "getPattern", "Ljava/util/List;", "getPatternData", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "getPrev", "getPrev$annotations", "()V", "Lf1d;", "getSource", "getAid", "getSpreadId", "Companion", "ai/askquin/ui/persistence/serialization/d", "ai/askquin/ui/persistence/serialization/e", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Analysis implements SerializableDivinationState {
        private static final lw7[] $childSerializers;
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String aid;
        private final String pattern;
        private final List<PatternData> patternData;
        private final Patternable prev;
        private final String question;
        private final f1d source;
        private final String spreadId;

        static {
            gpc gpcVar = new gpc(11);
            z18 z18Var = z18.b;
            $childSerializers = new lw7[]{null, null, eb3.N(z18Var, gpcVar), eb3.N(z18Var, new gpc(12)), eb3.N(z18Var, new gpc(13)), null, null};
        }

        public /* synthetic */ Analysis(int i, String str, String str2, List list, Patternable patternable, f1d f1dVar, String str3, String str4, xyc xycVar) {
            if (15 != (i & 15)) {
                an1.R(i, 15, d.a.e());
                throw null;
            }
            this.question = str;
            this.pattern = str2;
            this.patternData = list;
            this.prev = patternable;
            if ((i & 16) == 0) {
                this.source = null;
            } else {
                this.source = f1dVar;
            }
            if ((i & 32) == 0) {
                this.aid = null;
            } else {
                this.aid = str3;
            }
            if ((i & 64) == 0) {
                this.spreadId = null;
            } else {
                this.spreadId = str4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(g2a.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xn7 _childSerializers$_anonymous_$0() {
            return new aja(job.a.b(Patternable.class), new Annotation[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xn7 _childSerializers$_anonymous_$1() {
            f1d[] f1dVarArrValues = f1d.values();
            f1dVarArrValues.getClass();
            return new wn2("ai.askquin.ui.conversation.SessionSource", f1dVarArrValues);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Analysis copy$default(Analysis analysis, String str, String str2, List list, Patternable patternable, f1d f1dVar, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analysis.question;
            }
            if ((i & 2) != 0) {
                str2 = analysis.pattern;
            }
            if ((i & 4) != 0) {
                list = analysis.patternData;
            }
            if ((i & 8) != 0) {
                patternable = analysis.prev;
            }
            if ((i & 16) != 0) {
                f1dVar = analysis.source;
            }
            if ((i & 32) != 0) {
                str3 = analysis.aid;
            }
            if ((i & 64) != 0) {
                str4 = analysis.spreadId;
            }
            String str5 = str3;
            String str6 = str4;
            f1d f1dVar2 = f1dVar;
            List list2 = list;
            return analysis.copy(str, str2, list2, patternable, f1dVar2, str5, str6);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(Analysis self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.question);
            output.w(serialDesc, 1, self.pattern);
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.patternData);
            output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.prev);
            if (output.g(serialDesc) || self.source != null) {
                output.A(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.source);
            }
            if (output.g(serialDesc) || self.aid != null) {
                output.A(serialDesc, 5, p4e.a, self.aid);
            }
            if (!output.g(serialDesc) && self.spreadId == null) {
                return;
            }
            output.A(serialDesc, 6, p4e.a, self.spreadId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public final List<PatternData> component3() {
            return this.patternData;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Patternable getPrev() {
            return this.prev;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final f1d getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAid() {
            return this.aid;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSpreadId() {
            return this.spreadId;
        }

        public final Analysis copy(String question, String pattern, List<PatternData> patternData, Patternable prev, f1d source, String aid, String spreadId) {
            question.getClass();
            pattern.getClass();
            patternData.getClass();
            prev.getClass();
            return new Analysis(question, pattern, patternData, prev, source, aid, spreadId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analysis)) {
                return false;
            }
            Analysis analysis = (Analysis) other;
            return pa7.t(this.question, analysis.question) && pa7.t(this.pattern, analysis.pattern) && pa7.t(this.patternData, analysis.patternData) && pa7.t(this.prev, analysis.prev) && this.source == analysis.source && pa7.t(this.aid, analysis.aid) && pa7.t(this.spreadId, analysis.spreadId);
        }

        public final String getAid() {
            return this.aid;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final List<PatternData> getPatternData() {
            return this.patternData;
        }

        public final Patternable getPrev() {
            return this.prev;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final f1d getSource() {
            return this.source;
        }

        public final String getSpreadId() {
            return this.spreadId;
        }

        public int hashCode() {
            int iHashCode = (this.prev.hashCode() + tec.a(ub3.c(this.question.hashCode() * 31, 31, this.pattern), 31, this.patternData)) * 31;
            f1d f1dVar = this.source;
            int iHashCode2 = (iHashCode + (f1dVar == null ? 0 : f1dVar.hashCode())) * 31;
            String str = this.aid;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.spreadId;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.question;
            String str2 = this.pattern;
            List<PatternData> list = this.patternData;
            Patternable patternable = this.prev;
            f1d f1dVar = this.source;
            String str3 = this.aid;
            String str4 = this.spreadId;
            StringBuilder sbO = ib8.o("Analysis(question=", str, ", pattern=", str2, ", patternData=");
            sbO.append(list);
            sbO.append(", prev=");
            sbO.append(patternable);
            sbO.append(", source=");
            sbO.append(f1dVar);
            sbO.append(", aid=");
            sbO.append(str3);
            sbO.append(", spreadId=");
            return ks0.l(sbO, str4, ")");
        }

        @yia
        public static /* synthetic */ void getPrev$annotations() {
        }

        public Analysis(String str, String str2, List<PatternData> list, Patternable patternable, f1d f1dVar, String str3, String str4) {
            str.getClass();
            str2.getClass();
            list.getClass();
            patternable.getClass();
            this.question = str;
            this.pattern = str2;
            this.patternData = list;
            this.prev = patternable;
            this.source = f1dVar;
            this.aid = str3;
            this.spreadId = str4;
        }

        public /* synthetic */ Analysis(String str, String str2, List list, Patternable patternable, f1d f1dVar, String str3, String str4, int i, rp3 rp3Var) {
            this(str, str2, list, patternable, (i & 16) != 0 ? null : f1dVar, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018¨\u0006,"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsExplanation;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "", "text", "prev", "<init>", "(Ljava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableDivinationState;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableDivinationState;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsExplanation;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "copy", "(Ljava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableDivinationState;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsExplanation;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "getPrev", "getPrev$annotations", "()V", "Companion", "ai/askquin/ui/persistence/serialization/h", "ai/askquin/ui/persistence/serialization/i", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardsExplanation implements SerializableDivinationState {
        public static final int $stable = 8;
        private final SerializableDivinationState prev;
        private final String text;
        public static final i Companion = new i();
        private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new gpc(15))};

        public /* synthetic */ CardsExplanation(int i, String str, SerializableDivinationState serializableDivinationState, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, h.a.e());
                throw null;
            }
            this.text = str;
            this.prev = serializableDivinationState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xn7 _childSerializers$_anonymous_() {
            return new aja(job.a.b(SerializableDivinationState.class), new Annotation[0]);
        }

        public static /* synthetic */ CardsExplanation copy$default(CardsExplanation cardsExplanation, String str, SerializableDivinationState serializableDivinationState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardsExplanation.text;
            }
            if ((i & 2) != 0) {
                serializableDivinationState = cardsExplanation.prev;
            }
            return cardsExplanation.copy(str, serializableDivinationState);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardsExplanation self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.text);
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.prev);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SerializableDivinationState getPrev() {
            return this.prev;
        }

        public final CardsExplanation copy(String text, SerializableDivinationState prev) {
            text.getClass();
            prev.getClass();
            return new CardsExplanation(text, prev);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardsExplanation)) {
                return false;
            }
            CardsExplanation cardsExplanation = (CardsExplanation) other;
            return pa7.t(this.text, cardsExplanation.text) && pa7.t(this.prev, cardsExplanation.prev);
        }

        public final SerializableDivinationState getPrev() {
            return this.prev;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.prev.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return "CardsExplanation(text=" + this.text + ", prev=" + this.prev + ")";
        }

        @yia
        public static /* synthetic */ void getPrev$annotations() {
        }

        public CardsExplanation(String str, SerializableDivinationState serializableDivinationState) {
            str.getClass();
            serializableDivinationState.getClass();
            this.text = str;
            this.prev = serializableDivinationState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$PhotoTarot;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "analysis", "Lai/askquin/ui/persistence/serialization/PhotoTarotCard;", "card", "<init>", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Lai/askquin/ui/persistence/serialization/PhotoTarotCard;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Lai/askquin/ui/persistence/serialization/PhotoTarotCard;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$PhotoTarot;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "component2", "()Lai/askquin/ui/persistence/serialization/PhotoTarotCard;", "copy", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Lai/askquin/ui/persistence/serialization/PhotoTarotCard;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$PhotoTarot;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "getAnalysis", "Lai/askquin/ui/persistence/serialization/PhotoTarotCard;", "getCard", "Companion", "ai/askquin/ui/persistence/serialization/l", "ai/askquin/ui/persistence/serialization/m", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class PhotoTarot implements SerializableDivinationState {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final Analysis analysis;
        private final PhotoTarotCard card;

        public /* synthetic */ PhotoTarot(int i, Analysis analysis, PhotoTarotCard photoTarotCard, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, l.a.e());
                throw null;
            }
            this.analysis = analysis;
            this.card = photoTarotCard;
        }

        public static /* synthetic */ PhotoTarot copy$default(PhotoTarot photoTarot, Analysis analysis, PhotoTarotCard photoTarotCard, int i, Object obj) {
            if ((i & 1) != 0) {
                analysis = photoTarot.analysis;
            }
            if ((i & 2) != 0) {
                photoTarotCard = photoTarot.card;
            }
            return photoTarot.copy(analysis, photoTarotCard);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(PhotoTarot self, ag2 output, nyc serialDesc) {
            output.p(serialDesc, 0, d.a, self.analysis);
            output.p(serialDesc, 1, a.a, self.card);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Analysis getAnalysis() {
            return this.analysis;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PhotoTarotCard getCard() {
            return this.card;
        }

        public final PhotoTarot copy(Analysis analysis, PhotoTarotCard card) {
            analysis.getClass();
            card.getClass();
            return new PhotoTarot(analysis, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoTarot)) {
                return false;
            }
            PhotoTarot photoTarot = (PhotoTarot) other;
            return pa7.t(this.analysis, photoTarot.analysis) && pa7.t(this.card, photoTarot.card);
        }

        public final Analysis getAnalysis() {
            return this.analysis;
        }

        public final PhotoTarotCard getCard() {
            return this.card;
        }

        public int hashCode() {
            return (this.analysis.hashCode() * 31) + this.card.hashCode();
        }

        public String toString() {
            return "PhotoTarot(analysis=" + this.analysis + ", card=" + this.card + ")";
        }

        public PhotoTarot(Analysis analysis, PhotoTarotCard photoTarotCard) {
            analysis.getClass();
            photoTarotCard.getClass();
            this.analysis = analysis;
            this.card = photoTarotCard;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitAdditionalInfo;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "prev", "", "additionalInfo", "<init>", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitAdditionalInfo;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "component2", "()Ljava/lang/String;", "copy", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitAdditionalInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "getPrev", "Ljava/lang/String;", "getAdditionalInfo", "Companion", "ai/askquin/ui/persistence/serialization/n", "ai/askquin/ui/persistence/serialization/o", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WaitAdditionalInfo implements Patternable {
        public static final int $stable = 8;
        public static final o Companion = new o();
        private final String additionalInfo;
        private final WaitConfirm prev;

        public /* synthetic */ WaitAdditionalInfo(int i, WaitConfirm waitConfirm, String str, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, n.a.e());
                throw null;
            }
            this.prev = waitConfirm;
            if ((i & 2) == 0) {
                this.additionalInfo = null;
            } else {
                this.additionalInfo = str;
            }
        }

        public static /* synthetic */ WaitAdditionalInfo copy$default(WaitAdditionalInfo waitAdditionalInfo, WaitConfirm waitConfirm, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                waitConfirm = waitAdditionalInfo.prev;
            }
            if ((i & 2) != 0) {
                str = waitAdditionalInfo.additionalInfo;
            }
            return waitAdditionalInfo.copy(waitConfirm, str);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(WaitAdditionalInfo self, ag2 output, nyc serialDesc) {
            output.p(serialDesc, 0, p.a, self.prev);
            if (!output.g(serialDesc) && self.additionalInfo == null) {
                return;
            }
            output.A(serialDesc, 1, p4e.a, self.additionalInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WaitConfirm getPrev() {
            return this.prev;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final WaitAdditionalInfo copy(WaitConfirm prev, String additionalInfo) {
            prev.getClass();
            return new WaitAdditionalInfo(prev, additionalInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitAdditionalInfo)) {
                return false;
            }
            WaitAdditionalInfo waitAdditionalInfo = (WaitAdditionalInfo) other;
            return pa7.t(this.prev, waitAdditionalInfo.prev) && pa7.t(this.additionalInfo, waitAdditionalInfo.additionalInfo);
        }

        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final WaitConfirm getPrev() {
            return this.prev;
        }

        public int hashCode() {
            int iHashCode = this.prev.hashCode() * 31;
            String str = this.additionalInfo;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "WaitAdditionalInfo(prev=" + this.prev + ", additionalInfo=" + this.additionalInfo + ")";
        }

        public WaitAdditionalInfo(WaitConfirm waitConfirm, String str) {
            waitConfirm.getClass();
            this.prev = waitConfirm;
            this.additionalInfo = str;
        }

        public /* synthetic */ WaitAdditionalInfo(WaitConfirm waitConfirm, String str, int i, rp3 rp3Var) {
            this(waitConfirm, (i & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b4\u0010 ¨\u00068"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsDecided;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "analysis", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "", "postDrawAdditionalInfo", "postDrawAudioChatId", "postDrawAudioAssetId", "<init>", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsDecided;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$CardsDecided;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Analysis;", "getAnalysis", "Ljava/util/List;", "getCards", "Ljava/lang/String;", "getPostDrawAdditionalInfo", "getPostDrawAudioChatId", "getPostDrawAudioAssetId", "Companion", "ai/askquin/ui/persistence/serialization/f", "ai/askquin/ui/persistence/serialization/g", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardsDecided implements SerializableDivinationState {
        public static final int $stable = 0;
        private final Analysis analysis;
        private final List<TarotCardChoice> cards;
        private final String postDrawAdditionalInfo;
        private final String postDrawAudioAssetId;
        private final String postDrawAudioChatId;
        public static final g Companion = new g();
        private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new gpc(14)), null, null, null};

        public /* synthetic */ CardsDecided(int i, Analysis analysis, List list, String str, String str2, String str3, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, f.a.e());
                throw null;
            }
            this.analysis = analysis;
            this.cards = list;
            if ((i & 4) == 0) {
                this.postDrawAdditionalInfo = null;
            } else {
                this.postDrawAdditionalInfo = str;
            }
            if ((i & 8) == 0) {
                this.postDrawAudioChatId = null;
            } else {
                this.postDrawAudioChatId = str2;
            }
            if ((i & 16) == 0) {
                this.postDrawAudioAssetId = null;
            } else {
                this.postDrawAudioAssetId = str3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(rhe.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CardsDecided copy$default(CardsDecided cardsDecided, Analysis analysis, List list, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                analysis = cardsDecided.analysis;
            }
            if ((i & 2) != 0) {
                list = cardsDecided.cards;
            }
            if ((i & 4) != 0) {
                str = cardsDecided.postDrawAdditionalInfo;
            }
            if ((i & 8) != 0) {
                str2 = cardsDecided.postDrawAudioChatId;
            }
            if ((i & 16) != 0) {
                str3 = cardsDecided.postDrawAudioAssetId;
            }
            String str4 = str3;
            String str5 = str;
            return cardsDecided.copy(analysis, list, str5, str2, str4);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardsDecided self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.p(serialDesc, 0, d.a, self.analysis);
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cards);
            if (output.g(serialDesc) || self.postDrawAdditionalInfo != null) {
                output.A(serialDesc, 2, p4e.a, self.postDrawAdditionalInfo);
            }
            if (output.g(serialDesc) || self.postDrawAudioChatId != null) {
                output.A(serialDesc, 3, p4e.a, self.postDrawAudioChatId);
            }
            if (!output.g(serialDesc) && self.postDrawAudioAssetId == null) {
                return;
            }
            output.A(serialDesc, 4, p4e.a, self.postDrawAudioAssetId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Analysis getAnalysis() {
            return this.analysis;
        }

        public final List<TarotCardChoice> component2() {
            return this.cards;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPostDrawAdditionalInfo() {
            return this.postDrawAdditionalInfo;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPostDrawAudioChatId() {
            return this.postDrawAudioChatId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPostDrawAudioAssetId() {
            return this.postDrawAudioAssetId;
        }

        public final CardsDecided copy(Analysis analysis, List<TarotCardChoice> cards, String postDrawAdditionalInfo, String postDrawAudioChatId, String postDrawAudioAssetId) {
            analysis.getClass();
            cards.getClass();
            return new CardsDecided(analysis, cards, postDrawAdditionalInfo, postDrawAudioChatId, postDrawAudioAssetId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardsDecided)) {
                return false;
            }
            CardsDecided cardsDecided = (CardsDecided) other;
            return pa7.t(this.analysis, cardsDecided.analysis) && pa7.t(this.cards, cardsDecided.cards) && pa7.t(this.postDrawAdditionalInfo, cardsDecided.postDrawAdditionalInfo) && pa7.t(this.postDrawAudioChatId, cardsDecided.postDrawAudioChatId) && pa7.t(this.postDrawAudioAssetId, cardsDecided.postDrawAudioAssetId);
        }

        public final Analysis getAnalysis() {
            return this.analysis;
        }

        public final List<TarotCardChoice> getCards() {
            return this.cards;
        }

        public final String getPostDrawAdditionalInfo() {
            return this.postDrawAdditionalInfo;
        }

        public final String getPostDrawAudioAssetId() {
            return this.postDrawAudioAssetId;
        }

        public final String getPostDrawAudioChatId() {
            return this.postDrawAudioChatId;
        }

        public int hashCode() {
            int iA = tec.a(this.analysis.hashCode() * 31, 31, this.cards);
            String str = this.postDrawAdditionalInfo;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.postDrawAudioChatId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.postDrawAudioAssetId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            Analysis analysis = this.analysis;
            List<TarotCardChoice> list = this.cards;
            String str = this.postDrawAdditionalInfo;
            String str2 = this.postDrawAudioChatId;
            String str3 = this.postDrawAudioAssetId;
            StringBuilder sb = new StringBuilder("CardsDecided(analysis=");
            sb.append(analysis);
            sb.append(", cards=");
            sb.append(list);
            sb.append(", postDrawAdditionalInfo=");
            ub3.v(sb, str, ", postDrawAudioChatId=", str2, ", postDrawAudioAssetId=");
            return ks0.l(sb, str3, ")");
        }

        public CardsDecided(Analysis analysis, List<TarotCardChoice> list, String str, String str2, String str3) {
            analysis.getClass();
            list.getClass();
            this.analysis = analysis;
            this.cards = list;
            this.postDrawAdditionalInfo = str;
            this.postDrawAudioChatId = str2;
            this.postDrawAudioAssetId = str3;
        }

        public /* synthetic */ CardsDecided(Analysis analysis, List list, String str, String str2, String str3, int i, rp3 rp3Var) {
            this(analysis, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0080\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b\u0005\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b6\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b\u000b\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b:\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b;\u0010!¨\u0006?"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState$Patternable;", "", "question", "", "isCanTarot", "editQuestion", "", "editQuestions", "isSuitable", "suggestions", "isAdditionalInfoNeeded", "additionalInfoQuestion", "needsRevision", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lai/askquin/ui/persistence/serialization/SerializableDivinationState$WaitConfirm;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "Ljava/lang/Boolean;", "getEditQuestion", "Ljava/util/List;", "getEditQuestions", "getSuggestions", "getAdditionalInfoQuestion", "getNeedsRevision", "Companion", "ai/askquin/ui/persistence/serialization/p", "ai/askquin/ui/persistence/serialization/q", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WaitConfirm implements Patternable {
        public static final int $stable = 8;
        private final String additionalInfoQuestion;
        private final String editQuestion;
        private final List<String> editQuestions;
        private final Boolean isAdditionalInfoNeeded;
        private final Boolean isCanTarot;
        private final Boolean isSuitable;
        private final Boolean needsRevision;
        private final String question;
        private final String suggestions;
        public static final q Companion = new q();
        private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new gpc(17)), null, null, null, null, null};

        public /* synthetic */ WaitConfirm(int i, String str, Boolean bool, String str2, List list, Boolean bool2, String str3, Boolean bool3, String str4, Boolean bool4, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, p.a.e());
                throw null;
            }
            this.question = str;
            if ((i & 2) == 0) {
                this.isCanTarot = Boolean.TRUE;
            } else {
                this.isCanTarot = bool;
            }
            if ((i & 4) == 0) {
                this.editQuestion = null;
            } else {
                this.editQuestion = str2;
            }
            if ((i & 8) == 0) {
                this.editQuestions = null;
            } else {
                this.editQuestions = list;
            }
            if ((i & 16) == 0) {
                this.isSuitable = Boolean.TRUE;
            } else {
                this.isSuitable = bool2;
            }
            if ((i & 32) == 0) {
                this.suggestions = null;
            } else {
                this.suggestions = str3;
            }
            if ((i & 64) == 0) {
                this.isAdditionalInfoNeeded = Boolean.FALSE;
            } else {
                this.isAdditionalInfoNeeded = bool3;
            }
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                this.additionalInfoQuestion = null;
            } else {
                this.additionalInfoQuestion = str4;
            }
            if ((i & 256) == 0) {
                this.needsRevision = Boolean.FALSE;
            } else {
                this.needsRevision = bool4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(p4e.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitConfirm copy$default(WaitConfirm waitConfirm, String str, Boolean bool, String str2, List list, Boolean bool2, String str3, Boolean bool3, String str4, Boolean bool4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = waitConfirm.question;
            }
            if ((i & 2) != 0) {
                bool = waitConfirm.isCanTarot;
            }
            if ((i & 4) != 0) {
                str2 = waitConfirm.editQuestion;
            }
            if ((i & 8) != 0) {
                list = waitConfirm.editQuestions;
            }
            if ((i & 16) != 0) {
                bool2 = waitConfirm.isSuitable;
            }
            if ((i & 32) != 0) {
                str3 = waitConfirm.suggestions;
            }
            if ((i & 64) != 0) {
                bool3 = waitConfirm.isAdditionalInfoNeeded;
            }
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                str4 = waitConfirm.additionalInfoQuestion;
            }
            if ((i & 256) != 0) {
                bool4 = waitConfirm.needsRevision;
            }
            String str5 = str4;
            Boolean bool5 = bool4;
            String str6 = str3;
            Boolean bool6 = bool3;
            Boolean bool7 = bool2;
            String str7 = str2;
            return waitConfirm.copy(str, bool, str7, list, bool7, str6, bool6, str5, bool5);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(WaitConfirm self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.question);
            if (output.g(serialDesc) || !pa7.t(self.isCanTarot, Boolean.TRUE)) {
                output.A(serialDesc, 1, g11.a, self.isCanTarot);
            }
            if (output.g(serialDesc) || self.editQuestion != null) {
                output.A(serialDesc, 2, p4e.a, self.editQuestion);
            }
            if (output.g(serialDesc) || self.editQuestions != null) {
                output.A(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.editQuestions);
            }
            if (output.g(serialDesc) || !pa7.t(self.isSuitable, Boolean.TRUE)) {
                output.A(serialDesc, 4, g11.a, self.isSuitable);
            }
            if (output.g(serialDesc) || self.suggestions != null) {
                output.A(serialDesc, 5, p4e.a, self.suggestions);
            }
            if (output.g(serialDesc) || !pa7.t(self.isAdditionalInfoNeeded, Boolean.FALSE)) {
                output.A(serialDesc, 6, g11.a, self.isAdditionalInfoNeeded);
            }
            if (output.g(serialDesc) || self.additionalInfoQuestion != null) {
                output.A(serialDesc, 7, p4e.a, self.additionalInfoQuestion);
            }
            if (!output.g(serialDesc) && pa7.t(self.needsRevision, Boolean.FALSE)) {
                return;
            }
            output.A(serialDesc, 8, g11.a, self.needsRevision);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsCanTarot() {
            return this.isCanTarot;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEditQuestion() {
            return this.editQuestion;
        }

        public final List<String> component4() {
            return this.editQuestions;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIsSuitable() {
            return this.isSuitable;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSuggestions() {
            return this.suggestions;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getIsAdditionalInfoNeeded() {
            return this.isAdditionalInfoNeeded;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAdditionalInfoQuestion() {
            return this.additionalInfoQuestion;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getNeedsRevision() {
            return this.needsRevision;
        }

        public final WaitConfirm copy(String question, Boolean isCanTarot, String editQuestion, List<String> editQuestions, Boolean isSuitable, String suggestions, Boolean isAdditionalInfoNeeded, String additionalInfoQuestion, Boolean needsRevision) {
            question.getClass();
            return new WaitConfirm(question, isCanTarot, editQuestion, editQuestions, isSuitable, suggestions, isAdditionalInfoNeeded, additionalInfoQuestion, needsRevision);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitConfirm)) {
                return false;
            }
            WaitConfirm waitConfirm = (WaitConfirm) other;
            return pa7.t(this.question, waitConfirm.question) && pa7.t(this.isCanTarot, waitConfirm.isCanTarot) && pa7.t(this.editQuestion, waitConfirm.editQuestion) && pa7.t(this.editQuestions, waitConfirm.editQuestions) && pa7.t(this.isSuitable, waitConfirm.isSuitable) && pa7.t(this.suggestions, waitConfirm.suggestions) && pa7.t(this.isAdditionalInfoNeeded, waitConfirm.isAdditionalInfoNeeded) && pa7.t(this.additionalInfoQuestion, waitConfirm.additionalInfoQuestion) && pa7.t(this.needsRevision, waitConfirm.needsRevision);
        }

        public final String getAdditionalInfoQuestion() {
            return this.additionalInfoQuestion;
        }

        public final String getEditQuestion() {
            return this.editQuestion;
        }

        public final List<String> getEditQuestions() {
            return this.editQuestions;
        }

        public final Boolean getNeedsRevision() {
            return this.needsRevision;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final String getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            Boolean bool = this.isCanTarot;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.editQuestion;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.editQuestions;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool2 = this.isSuitable;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.suggestions;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.isAdditionalInfoNeeded;
            int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.additionalInfoQuestion;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool4 = this.needsRevision;
            return iHashCode8 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final Boolean isAdditionalInfoNeeded() {
            return this.isAdditionalInfoNeeded;
        }

        public final Boolean isCanTarot() {
            return this.isCanTarot;
        }

        public final Boolean isSuitable() {
            return this.isSuitable;
        }

        public String toString() {
            String str = this.question;
            Boolean bool = this.isCanTarot;
            String str2 = this.editQuestion;
            List<String> list = this.editQuestions;
            Boolean bool2 = this.isSuitable;
            String str3 = this.suggestions;
            Boolean bool3 = this.isAdditionalInfoNeeded;
            String str4 = this.additionalInfoQuestion;
            Boolean bool4 = this.needsRevision;
            StringBuilder sb = new StringBuilder("WaitConfirm(question=");
            sb.append(str);
            sb.append(", isCanTarot=");
            sb.append(bool);
            sb.append(", editQuestion=");
            ib8.v(sb, str2, ", editQuestions=", list, ", isSuitable=");
            sb.append(bool2);
            sb.append(", suggestions=");
            sb.append(str3);
            sb.append(", isAdditionalInfoNeeded=");
            sb.append(bool3);
            sb.append(", additionalInfoQuestion=");
            sb.append(str4);
            sb.append(", needsRevision=");
            sb.append(bool4);
            sb.append(")");
            return sb.toString();
        }

        public WaitConfirm(String str, Boolean bool, String str2, List<String> list, Boolean bool2, String str3, Boolean bool3, String str4, Boolean bool4) {
            str.getClass();
            this.question = str;
            this.isCanTarot = bool;
            this.editQuestion = str2;
            this.editQuestions = list;
            this.isSuitable = bool2;
            this.suggestions = str3;
            this.isAdditionalInfoNeeded = bool3;
            this.additionalInfoQuestion = str4;
            this.needsRevision = bool4;
        }

        public /* synthetic */ WaitConfirm(String str, Boolean bool, String str2, List list, Boolean bool2, String str3, Boolean bool3, String str4, Boolean bool4, int i, rp3 rp3Var) {
            this(str, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? Boolean.TRUE : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.FALSE : bool3, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 ? str4 : null, (i & 256) != 0 ? Boolean.FALSE : bool4);
        }
    }
}
