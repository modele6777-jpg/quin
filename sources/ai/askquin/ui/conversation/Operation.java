package ai.askquin.ui.conversation;

import defpackage.ad4;
import defpackage.an1;
import defpackage.bd4;
import defpackage.dd0;
import defpackage.dd4;
import defpackage.eb3;
import defpackage.ed4;
import defpackage.fd4;
import defpackage.gd4;
import defpackage.hd4;
import defpackage.ib8;
import defpackage.ik9;
import defpackage.jd4;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zc4;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\b\b\t\n\u000b\f\r\u000e\u000fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lai/askquin/ui/conversation/Operation;", "Ljd4;", "REQ", "", "state", "asRequisite", "(Ljd4;)Ljd4;", "Companion", "Ask", "Pattern", "UpdateQuestion", "SubmitAdditionalInfo", "SubmitSpread", "Explanation", "Chat", "ai/askquin/ui/conversation/x0", "Lai/askquin/ui/conversation/Operation$Ask;", "Lai/askquin/ui/conversation/Operation$Chat;", "Lai/askquin/ui/conversation/Operation$Explanation;", "Lai/askquin/ui/conversation/Operation$Pattern;", "Lai/askquin/ui/conversation/Operation$SubmitAdditionalInfo;", "Lai/askquin/ui/conversation/Operation$SubmitSpread;", "Lai/askquin/ui/conversation/Operation$UpdateQuestion;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface Operation<REQ extends jd4> {
    public static final x0 Companion = x0.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lai/askquin/ui/conversation/Operation$Ask;", "Lai/askquin/ui/conversation/Operation;", "Lhd4;", "<init>", "()V", "Ljd4;", "state", "asRequisite", "(Ljd4;)Lhd4;", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class Ask implements Operation<hd4> {
        public static final int $stable = 0;
        public static final Ask INSTANCE = new Ask();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(15));

        private Ask() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.conversation.Operation.Ask", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        @Override // ai.askquin.ui.conversation.Operation
        public hd4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof hd4) {
                return (hd4) state;
            }
            return null;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Ask);
        }

        public int hashCode() {
            return -1941384017;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Ask";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lai/askquin/ui/conversation/Operation$Chat;", "Lai/askquin/ui/conversation/Operation;", "Lbd4;", "<init>", "()V", "Ljd4;", "state", "asRequisite", "(Ljd4;)Lbd4;", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class Chat implements Operation<bd4> {
        public static final int $stable = 0;
        public static final Chat INSTANCE = new Chat();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(16));

        private Chat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.conversation.Operation.Chat", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        @Override // ai.askquin.ui.conversation.Operation
        public bd4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof bd4) {
                return (bd4) state;
            }
            return null;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Chat);
        }

        public int hashCode() {
            return -53313566;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Chat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lai/askquin/ui/conversation/Operation$Explanation;", "Lai/askquin/ui/conversation/Operation;", "Ldd4;", "<init>", "()V", "Ljd4;", "state", "asRequisite", "(Ljd4;)Ldd4;", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class Explanation implements Operation<dd4> {
        public static final int $stable = 0;
        public static final Explanation INSTANCE = new Explanation();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(17));

        private Explanation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.conversation.Operation.Explanation", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        @Override // ai.askquin.ui.conversation.Operation
        public dd4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof dd4) {
                return (dd4) state;
            }
            if (state instanceof bd4) {
                return ((bd4) state).b;
            }
            return null;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Explanation);
        }

        public int hashCode() {
            return 1758630479;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Explanation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lai/askquin/ui/conversation/Operation$Pattern;", "Lai/askquin/ui/conversation/Operation;", "Led4;", "<init>", "()V", "Ljd4;", "state", "asRequisite", "(Ljd4;)Led4;", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class Pattern implements Operation<ed4> {
        public static final int $stable = 0;
        public static final Pattern INSTANCE = new Pattern();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ik9(18));

        private Pattern() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.conversation.Operation.Pattern", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        @Override // ai.askquin.ui.conversation.Operation
        public ed4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof ed4) {
                return (ed4) state;
            }
            return null;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Pattern);
        }

        public int hashCode() {
            return -656655674;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Pattern";
        }
    }

    REQ asRequisite(jd4 state);

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u001a¨\u0006*"}, d2 = {"Lai/askquin/ui/conversation/Operation$SubmitAdditionalInfo;", "Lai/askquin/ui/conversation/Operation;", "Lfd4;", "", "additionalInfo", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/conversation/Operation$SubmitAdditionalInfo;Lag2;Lnyc;)V", "write$Self", "Ljd4;", "state", "asRequisite", "(Ljd4;)Lfd4;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lai/askquin/ui/conversation/Operation$SubmitAdditionalInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdditionalInfo", "Companion", "ai/askquin/ui/conversation/y0", "ai/askquin/ui/conversation/z0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class SubmitAdditionalInfo implements Operation<fd4> {
        public static final int $stable = 0;
        public static final z0 Companion = new z0();
        private final String additionalInfo;

        public /* synthetic */ SubmitAdditionalInfo(int i, String str, xyc xycVar) {
            if (1 == (i & 1)) {
                this.additionalInfo = str;
            } else {
                an1.R(i, 1, y0.a.e());
                throw null;
            }
        }

        public static /* synthetic */ SubmitAdditionalInfo copy$default(SubmitAdditionalInfo submitAdditionalInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submitAdditionalInfo.additionalInfo;
            }
            return submitAdditionalInfo.copy(str);
        }

        @Override // ai.askquin.ui.conversation.Operation
        public fd4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof fd4) {
                return (fd4) state;
            }
            return null;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final SubmitAdditionalInfo copy(String additionalInfo) {
            additionalInfo.getClass();
            return new SubmitAdditionalInfo(additionalInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitAdditionalInfo) && pa7.t(this.additionalInfo, ((SubmitAdditionalInfo) other).additionalInfo);
        }

        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public int hashCode() {
            return this.additionalInfo.hashCode();
        }

        public String toString() {
            return ib8.j("SubmitAdditionalInfo(additionalInfo=", this.additionalInfo, ")");
        }

        public SubmitAdditionalInfo(String str) {
            str.getClass();
            this.additionalInfo = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lai/askquin/ui/conversation/Operation$SubmitSpread;", "Lai/askquin/ui/conversation/Operation;", "Lzc4;", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/conversation/Operation$SubmitSpread;Lag2;Lnyc;)V", "write$Self", "Ljd4;", "state", "asRequisite", "(Ljd4;)Lzc4;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lai/askquin/ui/conversation/Operation$SubmitSpread;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "Companion", "ai/askquin/ui/conversation/a1", "ai/askquin/ui/conversation/b1", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class SubmitSpread implements Operation<zc4> {
        public static final int $stable = 8;
        private final List<TarotCardChoice> cards;
        public static final b1 Companion = new b1();
        private static final lw7[] $childSerializers = {eb3.N(z18.b, new ik9(19))};

        public /* synthetic */ SubmitSpread(int i, List list, xyc xycVar) {
            if (1 == (i & 1)) {
                this.cards = list;
            } else {
                an1.R(i, 1, a1.a.e());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(rhe.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubmitSpread copy$default(SubmitSpread submitSpread, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = submitSpread.cards;
            }
            return submitSpread.copy(list);
        }

        @Override // ai.askquin.ui.conversation.Operation
        public zc4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof zc4) {
                return (zc4) state;
            }
            if (state instanceof ad4) {
                return ((ad4) state).a;
            }
            if (state instanceof bd4) {
                dd4 dd4Var = ((bd4) state).b;
                ad4 ad4Var = dd4Var instanceof ad4 ? (ad4) dd4Var : null;
                if (ad4Var != null) {
                    return ad4Var.a;
                }
            }
            return null;
        }

        public final List<TarotCardChoice> component1() {
            return this.cards;
        }

        public final SubmitSpread copy(List<TarotCardChoice> cards) {
            cards.getClass();
            return new SubmitSpread(cards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitSpread) && pa7.t(this.cards, ((SubmitSpread) other).cards);
        }

        public final List<TarotCardChoice> getCards() {
            return this.cards;
        }

        public int hashCode() {
            return this.cards.hashCode();
        }

        public String toString() {
            return ib8.k("SubmitSpread(cards=", ")", this.cards);
        }

        public SubmitSpread(List<TarotCardChoice> list) {
            list.getClass();
            this.cards = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u001a¨\u0006*"}, d2 = {"Lai/askquin/ui/conversation/Operation$UpdateQuestion;", "Lai/askquin/ui/conversation/Operation;", "Lgd4;", "", "question", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/conversation/Operation$UpdateQuestion;Lag2;Lnyc;)V", "write$Self", "Ljd4;", "state", "asRequisite", "(Ljd4;)Lgd4;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lai/askquin/ui/conversation/Operation$UpdateQuestion;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "Companion", "ai/askquin/ui/conversation/c1", "ai/askquin/ui/conversation/d1", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    public static final /* data */ class UpdateQuestion implements Operation<gd4> {
        public static final int $stable = 0;
        public static final d1 Companion = new d1();
        private final String question;

        public /* synthetic */ UpdateQuestion(int i, String str, xyc xycVar) {
            if (1 == (i & 1)) {
                this.question = str;
            } else {
                an1.R(i, 1, c1.a.e());
                throw null;
            }
        }

        public static /* synthetic */ UpdateQuestion copy$default(UpdateQuestion updateQuestion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateQuestion.question;
            }
            return updateQuestion.copy(str);
        }

        @Override // ai.askquin.ui.conversation.Operation
        public gd4 asRequisite(jd4 state) {
            state.getClass();
            if (state instanceof gd4) {
                return (gd4) state;
            }
            return null;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public final UpdateQuestion copy(String question) {
            question.getClass();
            return new UpdateQuestion(question);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateQuestion) && pa7.t(this.question, ((UpdateQuestion) other).question);
        }

        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            return this.question.hashCode();
        }

        public String toString() {
            return ib8.j("UpdateQuestion(question=", this.question, ")");
        }

        public UpdateQuestion(String str) {
            str.getClass();
            this.question = str;
        }
    }
}
