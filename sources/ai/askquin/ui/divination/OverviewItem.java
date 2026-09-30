package ai.askquin.ui.divination;

import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ik9;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lai/askquin/ui/divination/OverviewItem;", "", "Companion", "Share", "Divider", "UserMessageItem", "ServerMessageItem", "NewReadingItem", "ClarifyingCardItem", "ContinuationChatSlice", "FailReason", "Loading", "ai/askquin/ui/divination/c", "Lai/askquin/ui/divination/OverviewItem$ClarifyingCardItem;", "Lai/askquin/ui/divination/OverviewItem$ContinuationChatSlice;", "Lai/askquin/ui/divination/OverviewItem$Divider;", "Lai/askquin/ui/divination/OverviewItem$FailReason;", "Lai/askquin/ui/divination/OverviewItem$Loading;", "Lai/askquin/ui/divination/OverviewItem$NewReadingItem;", "Lai/askquin/ui/divination/OverviewItem$ServerMessageItem;", "Lai/askquin/ui/divination/OverviewItem$Share;", "Lai/askquin/ui/divination/OverviewItem$UserMessageItem;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface OverviewItem {
    public static final c Companion = c.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$ContinuationChatSlice;", "Lai/askquin/ui/divination/OverviewItem;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ContinuationChatSlice implements OverviewItem {
        public static final int $stable = 0;
        public static final ContinuationChatSlice INSTANCE = new ContinuationChatSlice();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(24));

        private ContinuationChatSlice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.divination.OverviewItem.ContinuationChatSlice", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ContinuationChatSlice);
        }

        public int hashCode() {
            return -858852664;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ContinuationChatSlice";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$Divider;", "Lai/askquin/ui/divination/OverviewItem;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Divider implements OverviewItem {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(25));

        private Divider() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.divination.OverviewItem.Divider", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Divider);
        }

        public int hashCode() {
            return 417968638;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Divider";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$FailReason;", "Lai/askquin/ui/divination/OverviewItem;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FailReason implements OverviewItem {
        public static final int $stable = 0;
        public static final FailReason INSTANCE = new FailReason();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(26));

        private FailReason() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.divination.OverviewItem.FailReason", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FailReason);
        }

        public int hashCode() {
            return -1554660867;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "FailReason";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$Loading;", "Lai/askquin/ui/divination/OverviewItem;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Loading implements OverviewItem {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(27));

        private Loading() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.divination.OverviewItem.Loading", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -919699423;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$Share;", "Lai/askquin/ui/divination/OverviewItem;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Share implements OverviewItem {
        public static final int $stable = 0;
        public static final Share INSTANCE = new Share();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(29));

        private Share() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.divination.OverviewItem.Share", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Share);
        }

        public int hashCode() {
            return -942185468;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Share";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lai/askquin/ui/divination/OverviewItem$UserMessageItem;", "Lai/askquin/ui/divination/OverviewItem;", "", "text", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/divination/OverviewItem$UserMessageItem;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/divination/OverviewItem$UserMessageItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getId", "Companion", "ai/askquin/ui/divination/h", "ai/askquin/ui/divination/i", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class UserMessageItem implements OverviewItem {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final String id;
        private final String text;

        public /* synthetic */ UserMessageItem(int i, String str, String str2, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, h.a.e());
                throw null;
            }
            this.text = str;
            this.id = str2;
        }

        public static /* synthetic */ UserMessageItem copy$default(UserMessageItem userMessageItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userMessageItem.text;
            }
            if ((i & 2) != 0) {
                str2 = userMessageItem.id;
            }
            return userMessageItem.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UserMessageItem self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.text);
            output.w(serialDesc, 1, self.id);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final UserMessageItem copy(String text, String id) {
            text.getClass();
            id.getClass();
            return new UserMessageItem(text, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserMessageItem)) {
                return false;
            }
            UserMessageItem userMessageItem = (UserMessageItem) other;
            return pa7.t(this.text, userMessageItem.text) && pa7.t(this.id, userMessageItem.id);
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.id.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return tec.m("UserMessageItem(text=", this.text, ", id=", this.id, ")");
        }

        public UserMessageItem(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.text = str;
            this.id = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$ServerMessageItem;", "Lai/askquin/ui/divination/OverviewItem;", "", "text", "id", "", "finished", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/divination/OverviewItem$ServerMessageItem;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lai/askquin/ui/divination/OverviewItem$ServerMessageItem;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getId", "Z", "getFinished", "Companion", "ai/askquin/ui/divination/f", "ai/askquin/ui/divination/g", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ServerMessageItem implements OverviewItem {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final boolean finished;
        private final String id;
        private final String text;

        public /* synthetic */ ServerMessageItem(int i, String str, String str2, boolean z, xyc xycVar) {
            if (7 != (i & 7)) {
                an1.R(i, 7, f.a.e());
                throw null;
            }
            this.text = str;
            this.id = str2;
            this.finished = z;
        }

        public static /* synthetic */ ServerMessageItem copy$default(ServerMessageItem serverMessageItem, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverMessageItem.text;
            }
            if ((i & 2) != 0) {
                str2 = serverMessageItem.id;
            }
            if ((i & 4) != 0) {
                z = serverMessageItem.finished;
            }
            return serverMessageItem.copy(str, str2, z);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ServerMessageItem self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.text);
            output.w(serialDesc, 1, self.id);
            output.o(serialDesc, 2, self.finished);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final ServerMessageItem copy(String text, String id, boolean finished) {
            text.getClass();
            id.getClass();
            return new ServerMessageItem(text, id, finished);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerMessageItem)) {
                return false;
            }
            ServerMessageItem serverMessageItem = (ServerMessageItem) other;
            return pa7.t(this.text, serverMessageItem.text) && pa7.t(this.id, serverMessageItem.id) && this.finished == serverMessageItem.finished;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.finished) + ub3.c(this.text.hashCode() * 31, 31, this.id);
        }

        public String toString() {
            String str = this.text;
            String str2 = this.id;
            return ub3.m(ib8.o("ServerMessageItem(text=", str, ", id=", str2, ", finished="), this.finished, ")");
        }

        public ServerMessageItem(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.text = str;
            this.id = str2;
            this.finished = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$NewReadingItem;", "Lai/askquin/ui/divination/OverviewItem;", "", "messageId", "question", "childReadingId", "Lai/askquin/ui/conversation/dialogue/NewReadingState;", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/NewReadingState;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/NewReadingState;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/divination/OverviewItem$NewReadingItem;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lai/askquin/ui/conversation/dialogue/NewReadingState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/NewReadingState;)Lai/askquin/ui/divination/OverviewItem$NewReadingItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "getQuestion", "getChildReadingId", "Lai/askquin/ui/conversation/dialogue/NewReadingState;", "getState", "Companion", "ai/askquin/ui/divination/d", "ai/askquin/ui/divination/e", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class NewReadingItem implements OverviewItem {
        public static final int $stable = 0;
        private final String childReadingId;
        private final String messageId;
        private final String question;
        private final NewReadingState state;
        public static final e Companion = new e();
        private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new ik9(28))};

        public /* synthetic */ NewReadingItem(int i, String str, String str2, String str3, NewReadingState newReadingState, xyc xycVar) {
            if (15 != (i & 15)) {
                an1.R(i, 15, d.a.e());
                throw null;
            }
            this.messageId = str;
            this.question = str2;
            this.childReadingId = str3;
            this.state = newReadingState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return NewReadingState.Companion.serializer();
        }

        public static /* synthetic */ NewReadingItem copy$default(NewReadingItem newReadingItem, String str, String str2, String str3, NewReadingState newReadingState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newReadingItem.messageId;
            }
            if ((i & 2) != 0) {
                str2 = newReadingItem.question;
            }
            if ((i & 4) != 0) {
                str3 = newReadingItem.childReadingId;
            }
            if ((i & 8) != 0) {
                newReadingState = newReadingItem.state;
            }
            return newReadingItem.copy(str, str2, str3, newReadingState);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(NewReadingItem self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.messageId);
            output.w(serialDesc, 1, self.question);
            output.A(serialDesc, 2, p4e.a, self.childReadingId);
            output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.state);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChildReadingId() {
            return this.childReadingId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final NewReadingState getState() {
            return this.state;
        }

        public final NewReadingItem copy(String messageId, String question, String childReadingId, NewReadingState state) {
            messageId.getClass();
            question.getClass();
            state.getClass();
            return new NewReadingItem(messageId, question, childReadingId, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewReadingItem)) {
                return false;
            }
            NewReadingItem newReadingItem = (NewReadingItem) other;
            return pa7.t(this.messageId, newReadingItem.messageId) && pa7.t(this.question, newReadingItem.question) && pa7.t(this.childReadingId, newReadingItem.childReadingId) && this.state == newReadingItem.state;
        }

        public final String getChildReadingId() {
            return this.childReadingId;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final NewReadingState getState() {
            return this.state;
        }

        public int hashCode() {
            int iC = ub3.c(this.messageId.hashCode() * 31, 31, this.question);
            String str = this.childReadingId;
            return this.state.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.messageId;
            String str2 = this.question;
            String str3 = this.childReadingId;
            NewReadingState newReadingState = this.state;
            StringBuilder sbO = ib8.o("NewReadingItem(messageId=", str, ", question=", str2, ", childReadingId=");
            sbO.append(str3);
            sbO.append(", state=");
            sbO.append(newReadingState);
            sbO.append(")");
            return sbO.toString();
        }

        public NewReadingItem(String str, String str2, String str3, NewReadingState newReadingState) {
            str.getClass();
            str2.getClass();
            newReadingState.getClass();
            this.messageId = str;
            this.question = str2;
            this.childReadingId = str3;
            this.state = newReadingState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)JZ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b;\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010)¨\u0006C"}, d2 = {"Lai/askquin/ui/divination/OverviewItem$ClarifyingCardItem;", "Lai/askquin/ui/divination/OverviewItem;", "", "messageId", "label", "Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;", "state", "Ltech/chatmind/api/TarotCardChoice;", "card", "pendingCard", "Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;", "drawActionState", "Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;", "skipActionState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;Ltech/chatmind/api/TarotCardChoice;Ltech/chatmind/api/TarotCardChoice;Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;Ltech/chatmind/api/TarotCardChoice;Ltech/chatmind/api/TarotCardChoice;Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/divination/OverviewItem$ClarifyingCardItem;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;", "component4", "()Ltech/chatmind/api/TarotCardChoice;", "component5", "component6", "()Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;", "component7", "()Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;Ltech/chatmind/api/TarotCardChoice;Ltech/chatmind/api/TarotCardChoice;Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;)Lai/askquin/ui/divination/OverviewItem$ClarifyingCardItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "getLabel", "Lai/askquin/ui/conversation/dialogue/ClarifyingCardState;", "getState", "Ltech/chatmind/api/TarotCardChoice;", "getCard", "getPendingCard", "Lai/askquin/ui/conversation/ClarifyingCardDrawActionState;", "getDrawActionState", "Lai/askquin/ui/conversation/ClarifyingCardSkipActionState;", "getSkipActionState", "Companion", "ai/askquin/ui/divination/a", "ai/askquin/ui/divination/b", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ClarifyingCardItem implements OverviewItem {
        private static final lw7[] $childSerializers;
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final TarotCardChoice card;
        private final ClarifyingCardDrawActionState drawActionState;
        private final String label;
        private final String messageId;
        private final TarotCardChoice pendingCard;
        private final ClarifyingCardSkipActionState skipActionState;
        private final ClarifyingCardState state;

        static {
            ik9 ik9Var = new ik9(21);
            z18 z18Var = z18.b;
            $childSerializers = new lw7[]{null, null, eb3.N(z18Var, ik9Var), null, null, eb3.N(z18Var, new ik9(22)), eb3.N(z18Var, new ik9(23))};
        }

        public /* synthetic */ ClarifyingCardItem(int i, String str, String str2, ClarifyingCardState clarifyingCardState, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, ClarifyingCardDrawActionState clarifyingCardDrawActionState, ClarifyingCardSkipActionState clarifyingCardSkipActionState, xyc xycVar) {
            if (127 != (i & 127)) {
                an1.R(i, 127, a.a.e());
                throw null;
            }
            this.messageId = str;
            this.label = str2;
            this.state = clarifyingCardState;
            this.card = tarotCardChoice;
            this.pendingCard = tarotCardChoice2;
            this.drawActionState = clarifyingCardDrawActionState;
            this.skipActionState = clarifyingCardSkipActionState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return ClarifyingCardState.Companion.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
            return ClarifyingCardDrawActionState.Companion.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
            return ClarifyingCardSkipActionState.Companion.serializer();
        }

        public static /* synthetic */ ClarifyingCardItem copy$default(ClarifyingCardItem clarifyingCardItem, String str, String str2, ClarifyingCardState clarifyingCardState, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, ClarifyingCardDrawActionState clarifyingCardDrawActionState, ClarifyingCardSkipActionState clarifyingCardSkipActionState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clarifyingCardItem.messageId;
            }
            if ((i & 2) != 0) {
                str2 = clarifyingCardItem.label;
            }
            if ((i & 4) != 0) {
                clarifyingCardState = clarifyingCardItem.state;
            }
            if ((i & 8) != 0) {
                tarotCardChoice = clarifyingCardItem.card;
            }
            if ((i & 16) != 0) {
                tarotCardChoice2 = clarifyingCardItem.pendingCard;
            }
            if ((i & 32) != 0) {
                clarifyingCardDrawActionState = clarifyingCardItem.drawActionState;
            }
            if ((i & 64) != 0) {
                clarifyingCardSkipActionState = clarifyingCardItem.skipActionState;
            }
            ClarifyingCardDrawActionState clarifyingCardDrawActionState2 = clarifyingCardDrawActionState;
            ClarifyingCardSkipActionState clarifyingCardSkipActionState2 = clarifyingCardSkipActionState;
            TarotCardChoice tarotCardChoice3 = tarotCardChoice2;
            ClarifyingCardState clarifyingCardState2 = clarifyingCardState;
            return clarifyingCardItem.copy(str, str2, clarifyingCardState2, tarotCardChoice, tarotCardChoice3, clarifyingCardDrawActionState2, clarifyingCardSkipActionState2);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ClarifyingCardItem self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.messageId);
            output.w(serialDesc, 1, self.label);
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.state);
            rhe rheVar = rhe.a;
            output.A(serialDesc, 3, rheVar, self.card);
            output.A(serialDesc, 4, rheVar, self.pendingCard);
            output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.drawActionState);
            output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.skipActionState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ClarifyingCardState getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TarotCardChoice getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TarotCardChoice getPendingCard() {
            return this.pendingCard;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final ClarifyingCardDrawActionState getDrawActionState() {
            return this.drawActionState;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ClarifyingCardSkipActionState getSkipActionState() {
            return this.skipActionState;
        }

        public final ClarifyingCardItem copy(String messageId, String label, ClarifyingCardState state, TarotCardChoice card, TarotCardChoice pendingCard, ClarifyingCardDrawActionState drawActionState, ClarifyingCardSkipActionState skipActionState) {
            messageId.getClass();
            label.getClass();
            state.getClass();
            drawActionState.getClass();
            skipActionState.getClass();
            return new ClarifyingCardItem(messageId, label, state, card, pendingCard, drawActionState, skipActionState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClarifyingCardItem)) {
                return false;
            }
            ClarifyingCardItem clarifyingCardItem = (ClarifyingCardItem) other;
            return pa7.t(this.messageId, clarifyingCardItem.messageId) && pa7.t(this.label, clarifyingCardItem.label) && this.state == clarifyingCardItem.state && pa7.t(this.card, clarifyingCardItem.card) && pa7.t(this.pendingCard, clarifyingCardItem.pendingCard) && pa7.t(this.drawActionState, clarifyingCardItem.drawActionState) && pa7.t(this.skipActionState, clarifyingCardItem.skipActionState);
        }

        public final TarotCardChoice getCard() {
            return this.card;
        }

        public final ClarifyingCardDrawActionState getDrawActionState() {
            return this.drawActionState;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final TarotCardChoice getPendingCard() {
            return this.pendingCard;
        }

        public final ClarifyingCardSkipActionState getSkipActionState() {
            return this.skipActionState;
        }

        public final ClarifyingCardState getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = (this.state.hashCode() + ub3.c(this.messageId.hashCode() * 31, 31, this.label)) * 31;
            TarotCardChoice tarotCardChoice = this.card;
            int iHashCode2 = (iHashCode + (tarotCardChoice == null ? 0 : tarotCardChoice.hashCode())) * 31;
            TarotCardChoice tarotCardChoice2 = this.pendingCard;
            int iHashCode3 = tarotCardChoice2 != null ? tarotCardChoice2.hashCode() : 0;
            return this.skipActionState.hashCode() + ((this.drawActionState.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
        }

        public String toString() {
            String str = this.messageId;
            String str2 = this.label;
            ClarifyingCardState clarifyingCardState = this.state;
            TarotCardChoice tarotCardChoice = this.card;
            TarotCardChoice tarotCardChoice2 = this.pendingCard;
            ClarifyingCardDrawActionState clarifyingCardDrawActionState = this.drawActionState;
            ClarifyingCardSkipActionState clarifyingCardSkipActionState = this.skipActionState;
            StringBuilder sbO = ib8.o("ClarifyingCardItem(messageId=", str, ", label=", str2, ", state=");
            sbO.append(clarifyingCardState);
            sbO.append(", card=");
            sbO.append(tarotCardChoice);
            sbO.append(", pendingCard=");
            sbO.append(tarotCardChoice2);
            sbO.append(", drawActionState=");
            sbO.append(clarifyingCardDrawActionState);
            sbO.append(", skipActionState=");
            sbO.append(clarifyingCardSkipActionState);
            sbO.append(")");
            return sbO.toString();
        }

        public ClarifyingCardItem(String str, String str2, ClarifyingCardState clarifyingCardState, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, ClarifyingCardDrawActionState clarifyingCardDrawActionState, ClarifyingCardSkipActionState clarifyingCardSkipActionState) {
            str.getClass();
            str2.getClass();
            clarifyingCardState.getClass();
            clarifyingCardDrawActionState.getClass();
            clarifyingCardSkipActionState.getClass();
            this.messageId = str;
            this.label = str2;
            this.state = clarifyingCardState;
            this.card = tarotCardChoice;
            this.pendingCard = tarotCardChoice2;
            this.drawActionState = clarifyingCardDrawActionState;
            this.skipActionState = clarifyingCardSkipActionState;
        }
    }
}
