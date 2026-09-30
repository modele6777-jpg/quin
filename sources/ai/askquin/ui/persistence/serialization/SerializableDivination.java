package ai.askquin.ui.persistence.serialization;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.x0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.hx8;
import defpackage.k6a;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.uyc;
import defpackage.xef;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002PQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u008a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bG\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bH\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bN\u0010*¨\u0006R"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDivination;", "", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "state", "", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "messages", "Lai/askquin/ui/conversation/Operation;", "failedOperation", "Lai/askquin/ui/conversation/FailReason;", "failedReason", "workingOperation", "Lai/askquin/ui/persistence/query/PendingClarifyingCardSubmission;", "pendingClarifyingCards", "Lai/askquin/data/QuotaBlockReason;", "readingBlockReason", "Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;", "drawBeforeQuestion", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "mixedDeck", "<init>", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState;Ljava/util/List;Lai/askquin/ui/conversation/Operation;Lai/askquin/ui/conversation/FailReason;Lai/askquin/ui/conversation/Operation;Ljava/util/List;Lai/askquin/data/QuotaBlockReason;Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/persistence/serialization/SerializableDivinationState;Ljava/util/List;Lai/askquin/ui/conversation/Operation;Lai/askquin/ui/conversation/FailReason;Lai/askquin/ui/conversation/Operation;Ljava/util/List;Lai/askquin/data/QuotaBlockReason;Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;Lxyc;)V", "component1", "()Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "component2", "()Ljava/util/List;", "component3", "()Lai/askquin/ui/conversation/Operation;", "component4", "()Lai/askquin/ui/conversation/FailReason;", "component5", "component6", "component7", "()Lai/askquin/data/QuotaBlockReason;", "component8", "()Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;", "component9", "()Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "copy", "(Lai/askquin/ui/persistence/serialization/SerializableDivinationState;Ljava/util/List;Lai/askquin/ui/conversation/Operation;Lai/askquin/ui/conversation/FailReason;Lai/askquin/ui/conversation/Operation;Ljava/util/List;Lai/askquin/data/QuotaBlockReason;Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)Lai/askquin/ui/persistence/serialization/SerializableDivination;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDivination;Lag2;Lnyc;)V", "write$Self", "Lai/askquin/ui/persistence/serialization/SerializableDivinationState;", "getState", "Ljava/util/List;", "getMessages", "Lai/askquin/ui/conversation/Operation;", "getFailedOperation", "Lai/askquin/ui/conversation/FailReason;", "getFailedReason", "getWorkingOperation", "getPendingClarifyingCards", "Lai/askquin/data/QuotaBlockReason;", "getReadingBlockReason", "Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;", "getDrawBeforeQuestion", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "getMixedDeck", "Companion", "ai/askquin/ui/persistence/serialization/c", "uyc", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class SerializableDivination {
    private static final lw7[] $childSerializers;
    public static final uyc Companion = new uyc();
    private final SerializableDrawBeforeQuestion drawBeforeQuestion;
    private final Operation<?> failedOperation;
    private final FailReason failedReason;
    private final List<SerializableMessage> messages;
    private final MixedDeckSnapshot mixedDeck;
    private final List<PendingClarifyingCardSubmission> pendingClarifyingCards;
    private final QuotaBlockReason readingBlockReason;
    private final SerializableDivinationState state;
    private final Operation<?> workingOperation;

    static {
        b bVar = new b(0);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, bVar), eb3.N(z18Var, new b(1)), null, eb3.N(z18Var, new b(2)), null, eb3.N(z18Var, new b(3)), eb3.N(z18Var, new b(4)), null, null};
    }

    public /* synthetic */ SerializableDivination(int i, SerializableDivinationState serializableDivinationState, List list, Operation operation, FailReason failReason, Operation operation2, List list2, QuotaBlockReason quotaBlockReason, SerializableDrawBeforeQuestion serializableDrawBeforeQuestion, MixedDeckSnapshot mixedDeckSnapshot, xyc xycVar) {
        if (23 != (i & 23)) {
            an1.R(i, 23, c.a.e());
            throw null;
        }
        this.state = serializableDivinationState;
        this.messages = list;
        this.failedOperation = operation;
        if ((i & 8) == 0) {
            this.failedReason = null;
        } else {
            this.failedReason = failReason;
        }
        this.workingOperation = operation2;
        if ((i & 32) == 0) {
            this.pendingClarifyingCards = pu4.a;
        } else {
            this.pendingClarifyingCards = list2;
        }
        if ((i & 64) == 0) {
            this.readingBlockReason = null;
        } else {
            this.readingBlockReason = quotaBlockReason;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.drawBeforeQuestion = null;
        } else {
            this.drawBeforeQuestion = serializableDrawBeforeQuestion;
        }
        if ((i & 256) == 0) {
            this.mixedDeck = null;
        } else {
            this.mixedDeck = mixedDeckSnapshot;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return SerializableDivinationState.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(SerializableMessage.Companion.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return FailReason.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$2() {
        return new dd0(k6a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$3() {
        return QuotaBlockReason.Companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableDivination copy$default(SerializableDivination serializableDivination, SerializableDivinationState serializableDivinationState, List list, Operation operation, FailReason failReason, Operation operation2, List list2, QuotaBlockReason quotaBlockReason, SerializableDrawBeforeQuestion serializableDrawBeforeQuestion, MixedDeckSnapshot mixedDeckSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            serializableDivinationState = serializableDivination.state;
        }
        if ((i & 2) != 0) {
            list = serializableDivination.messages;
        }
        if ((i & 4) != 0) {
            operation = serializableDivination.failedOperation;
        }
        if ((i & 8) != 0) {
            failReason = serializableDivination.failedReason;
        }
        if ((i & 16) != 0) {
            operation2 = serializableDivination.workingOperation;
        }
        if ((i & 32) != 0) {
            list2 = serializableDivination.pendingClarifyingCards;
        }
        if ((i & 64) != 0) {
            quotaBlockReason = serializableDivination.readingBlockReason;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            serializableDrawBeforeQuestion = serializableDivination.drawBeforeQuestion;
        }
        if ((i & 256) != 0) {
            mixedDeckSnapshot = serializableDivination.mixedDeck;
        }
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion2 = serializableDrawBeforeQuestion;
        MixedDeckSnapshot mixedDeckSnapshot2 = mixedDeckSnapshot;
        List list3 = list2;
        QuotaBlockReason quotaBlockReason2 = quotaBlockReason;
        Operation operation3 = operation2;
        Operation operation4 = operation;
        return serializableDivination.copy(serializableDivinationState, list, operation4, failReason, operation3, list3, quotaBlockReason2, serializableDrawBeforeQuestion2, mixedDeckSnapshot2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SerializableDivination self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.state);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.messages);
        x0 x0Var = Operation.Companion;
        xef xefVar = xef.b;
        output.A(serialDesc, 2, x0Var.serializer(xefVar), self.failedOperation);
        if (output.g(serialDesc) || self.failedReason != null) {
            output.A(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.failedReason);
        }
        output.A(serialDesc, 4, x0Var.serializer(xefVar), self.workingOperation);
        if (output.g(serialDesc) || !pa7.t(self.pendingClarifyingCards, pu4.a)) {
            output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.pendingClarifyingCards);
        }
        if (output.g(serialDesc) || self.readingBlockReason != null) {
            output.A(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.readingBlockReason);
        }
        if (output.g(serialDesc) || self.drawBeforeQuestion != null) {
            output.A(serialDesc, 7, t.a, self.drawBeforeQuestion);
        }
        if (!output.g(serialDesc) && self.mixedDeck == null) {
            return;
        }
        output.A(serialDesc, 8, hx8.a, self.mixedDeck);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SerializableDivinationState getState() {
        return this.state;
    }

    public final List<SerializableMessage> component2() {
        return this.messages;
    }

    public final Operation<?> component3() {
        return this.failedOperation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FailReason getFailedReason() {
        return this.failedReason;
    }

    public final Operation<?> component5() {
        return this.workingOperation;
    }

    public final List<PendingClarifyingCardSubmission> component6() {
        return this.pendingClarifyingCards;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final QuotaBlockReason getReadingBlockReason() {
        return this.readingBlockReason;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SerializableDrawBeforeQuestion getDrawBeforeQuestion() {
        return this.drawBeforeQuestion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final SerializableDivination copy(SerializableDivinationState state, List<? extends SerializableMessage> messages, Operation<?> failedOperation, FailReason failedReason, Operation<?> workingOperation, List<PendingClarifyingCardSubmission> pendingClarifyingCards, QuotaBlockReason readingBlockReason, SerializableDrawBeforeQuestion drawBeforeQuestion, MixedDeckSnapshot mixedDeck) {
        state.getClass();
        messages.getClass();
        pendingClarifyingCards.getClass();
        return new SerializableDivination(state, messages, failedOperation, failedReason, workingOperation, pendingClarifyingCards, readingBlockReason, drawBeforeQuestion, mixedDeck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerializableDivination)) {
            return false;
        }
        SerializableDivination serializableDivination = (SerializableDivination) other;
        return pa7.t(this.state, serializableDivination.state) && pa7.t(this.messages, serializableDivination.messages) && pa7.t(this.failedOperation, serializableDivination.failedOperation) && pa7.t(this.failedReason, serializableDivination.failedReason) && pa7.t(this.workingOperation, serializableDivination.workingOperation) && pa7.t(this.pendingClarifyingCards, serializableDivination.pendingClarifyingCards) && this.readingBlockReason == serializableDivination.readingBlockReason && pa7.t(this.drawBeforeQuestion, serializableDivination.drawBeforeQuestion) && pa7.t(this.mixedDeck, serializableDivination.mixedDeck);
    }

    public final SerializableDrawBeforeQuestion getDrawBeforeQuestion() {
        return this.drawBeforeQuestion;
    }

    public final Operation<?> getFailedOperation() {
        return this.failedOperation;
    }

    public final FailReason getFailedReason() {
        return this.failedReason;
    }

    public final List<SerializableMessage> getMessages() {
        return this.messages;
    }

    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final List<PendingClarifyingCardSubmission> getPendingClarifyingCards() {
        return this.pendingClarifyingCards;
    }

    public final QuotaBlockReason getReadingBlockReason() {
        return this.readingBlockReason;
    }

    public final SerializableDivinationState getState() {
        return this.state;
    }

    public final Operation<?> getWorkingOperation() {
        return this.workingOperation;
    }

    public int hashCode() {
        int iA = tec.a(this.state.hashCode() * 31, 31, this.messages);
        Operation<?> operation = this.failedOperation;
        int iHashCode = (iA + (operation == null ? 0 : operation.hashCode())) * 31;
        FailReason failReason = this.failedReason;
        int iHashCode2 = (iHashCode + (failReason == null ? 0 : failReason.hashCode())) * 31;
        Operation<?> operation2 = this.workingOperation;
        int iA2 = tec.a((iHashCode2 + (operation2 == null ? 0 : operation2.hashCode())) * 31, 31, this.pendingClarifyingCards);
        QuotaBlockReason quotaBlockReason = this.readingBlockReason;
        int iHashCode3 = (iA2 + (quotaBlockReason == null ? 0 : quotaBlockReason.hashCode())) * 31;
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion = this.drawBeforeQuestion;
        int iHashCode4 = (iHashCode3 + (serializableDrawBeforeQuestion == null ? 0 : serializableDrawBeforeQuestion.hashCode())) * 31;
        MixedDeckSnapshot mixedDeckSnapshot = this.mixedDeck;
        return iHashCode4 + (mixedDeckSnapshot != null ? mixedDeckSnapshot.hashCode() : 0);
    }

    public String toString() {
        return "SerializableDivination(state=" + this.state + ", messages=" + this.messages + ", failedOperation=" + this.failedOperation + ", failedReason=" + this.failedReason + ", workingOperation=" + this.workingOperation + ", pendingClarifyingCards=" + this.pendingClarifyingCards + ", readingBlockReason=" + this.readingBlockReason + ", drawBeforeQuestion=" + this.drawBeforeQuestion + ", mixedDeck=" + this.mixedDeck + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerializableDivination(SerializableDivinationState serializableDivinationState, List<? extends SerializableMessage> list, Operation<?> operation, FailReason failReason, Operation<?> operation2, List<PendingClarifyingCardSubmission> list2, QuotaBlockReason quotaBlockReason, SerializableDrawBeforeQuestion serializableDrawBeforeQuestion, MixedDeckSnapshot mixedDeckSnapshot) {
        serializableDivinationState.getClass();
        list.getClass();
        list2.getClass();
        this.state = serializableDivinationState;
        this.messages = list;
        this.failedOperation = operation;
        this.failedReason = failReason;
        this.workingOperation = operation2;
        this.pendingClarifyingCards = list2;
        this.readingBlockReason = quotaBlockReason;
        this.drawBeforeQuestion = serializableDrawBeforeQuestion;
        this.mixedDeck = mixedDeckSnapshot;
    }

    public /* synthetic */ SerializableDivination(SerializableDivinationState serializableDivinationState, List list, Operation operation, FailReason failReason, Operation operation2, List list2, QuotaBlockReason quotaBlockReason, SerializableDrawBeforeQuestion serializableDrawBeforeQuestion, MixedDeckSnapshot mixedDeckSnapshot, int i, rp3 rp3Var) {
        this(serializableDivinationState, list, operation, (i & 8) != 0 ? null : failReason, operation2, (i & 32) != 0 ? pu4.a : list2, (i & 64) != 0 ? null : quotaBlockReason, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : serializableDrawBeforeQuestion, (i & 256) != 0 ? null : mixedDeckSnapshot);
    }
}
