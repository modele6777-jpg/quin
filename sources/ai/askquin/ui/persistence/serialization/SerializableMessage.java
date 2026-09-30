package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.gpc;
import defpackage.ib8;
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
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "Companion", "UserMessage", "AssistantMessage", "QuestionDescription", "QuestionAnalysis", "CardChoices", "CardExplanation", "ClarifyingCardRequest", "ClarifyingCardDraw", "ClarifyingCardInterpretation", "NewReadingRequest", "ai/askquin/ui/persistence/serialization/h0", "Lai/askquin/ui/persistence/serialization/SerializableMessage$AssistantMessage;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$CardChoices;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$CardExplanation;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardDraw;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardInterpretation;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardRequest;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$NewReadingRequest;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionAnalysis;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionDescription;", "Lai/askquin/ui/persistence/serialization/SerializableMessage$UserMessage;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface SerializableMessage {
    public static final h0 Companion = h0.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionDescription;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionDescription;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionDescription;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "ai/askquin/ui/persistence/serialization/m0", "ai/askquin/ui/persistence/serialization/n0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class QuestionDescription implements SerializableMessage {
        public static final int $stable = 0;
        public static final n0 Companion = new n0();
        private final String text;

        public /* synthetic */ QuestionDescription(int i, String str, xyc xycVar) {
            if (1 == (i & 1)) {
                this.text = str;
            } else {
                an1.R(i, 1, m0.a.e());
                throw null;
            }
        }

        public static /* synthetic */ QuestionDescription copy$default(QuestionDescription questionDescription, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = questionDescription.text;
            }
            return questionDescription.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final QuestionDescription copy(String text) {
            text.getClass();
            return new QuestionDescription(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuestionDescription) && pa7.t(this.text, ((QuestionDescription) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ib8.j("QuestionDescription(text=", this.text, ")");
        }

        public QuestionDescription(String str) {
            str.getClass();
            this.text = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$CardChoices;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "question", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$CardChoices;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lai/askquin/ui/persistence/serialization/SerializableMessage$CardChoices;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "Ljava/util/List;", "getCards", "Companion", "ai/askquin/ui/persistence/serialization/x", "ai/askquin/ui/persistence/serialization/y", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardChoices implements SerializableMessage {
        public static final int $stable = 8;
        private final List<TarotCardChoice> cards;
        private final String question;
        public static final y Companion = new y();
        private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new gpc(19))};

        public /* synthetic */ CardChoices(int i, String str, List list, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, x.a.e());
                throw null;
            }
            this.question = str;
            this.cards = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(rhe.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CardChoices copy$default(CardChoices cardChoices, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardChoices.question;
            }
            if ((i & 2) != 0) {
                list = cardChoices.cards;
            }
            return cardChoices.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardChoices self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.question);
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cards);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public final List<TarotCardChoice> component2() {
            return this.cards;
        }

        public final CardChoices copy(String question, List<TarotCardChoice> cards) {
            question.getClass();
            cards.getClass();
            return new CardChoices(question, cards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardChoices)) {
                return false;
            }
            CardChoices cardChoices = (CardChoices) other;
            return pa7.t(this.question, cardChoices.question) && pa7.t(this.cards, cardChoices.cards);
        }

        public final List<TarotCardChoice> getCards() {
            return this.cards;
        }

        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            return this.cards.hashCode() + (this.question.hashCode() * 31);
        }

        public String toString() {
            return "CardChoices(question=" + this.question + ", cards=" + this.cards + ")";
        }

        public CardChoices(String str, List<TarotCardChoice> list) {
            str.getClass();
            list.getClass();
            this.question = str;
            this.cards = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionAnalysis;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionAnalysis;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$QuestionAnalysis;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getText", "Companion", "ai/askquin/ui/persistence/serialization/k0", "ai/askquin/ui/persistence/serialization/l0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class QuestionAnalysis implements SerializableMessage {
        public static final int $stable = 0;
        public static final l0 Companion = new l0();
        private final String id;
        private final String text;

        public /* synthetic */ QuestionAnalysis(int i, String str, String str2, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, k0.a.e());
                throw null;
            }
            this.id = str;
            this.text = str2;
        }

        public static /* synthetic */ QuestionAnalysis copy$default(QuestionAnalysis questionAnalysis, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = questionAnalysis.id;
            }
            if ((i & 2) != 0) {
                str2 = questionAnalysis.text;
            }
            return questionAnalysis.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(QuestionAnalysis self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.id);
            output.w(serialDesc, 1, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final QuestionAnalysis copy(String id, String text) {
            id.getClass();
            text.getClass();
            return new QuestionAnalysis(id, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionAnalysis)) {
                return false;
            }
            QuestionAnalysis questionAnalysis = (QuestionAnalysis) other;
            return pa7.t(this.id, questionAnalysis.id) && pa7.t(this.text, questionAnalysis.text);
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return tec.m("QuestionAnalysis(id=", this.id, ", text=", this.text, ")");
        }

        public QuestionAnalysis(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.text = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardInterpretation;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "text", "drawMessageId", "requestMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardInterpretation;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardInterpretation;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getText", "getDrawMessageId", "getRequestMessageId", "Companion", "ai/askquin/ui/persistence/serialization/d0", "ai/askquin/ui/persistence/serialization/e0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ClarifyingCardInterpretation implements SerializableMessage {
        public static final int $stable = 0;
        public static final e0 Companion = new e0();
        private final String drawMessageId;
        private final String id;
        private final String requestMessageId;
        private final String text;

        public /* synthetic */ ClarifyingCardInterpretation(int i, String str, String str2, String str3, String str4, xyc xycVar) {
            if (15 != (i & 15)) {
                an1.R(i, 15, d0.a.e());
                throw null;
            }
            this.id = str;
            this.text = str2;
            this.drawMessageId = str3;
            this.requestMessageId = str4;
        }

        public static /* synthetic */ ClarifyingCardInterpretation copy$default(ClarifyingCardInterpretation clarifyingCardInterpretation, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clarifyingCardInterpretation.id;
            }
            if ((i & 2) != 0) {
                str2 = clarifyingCardInterpretation.text;
            }
            if ((i & 4) != 0) {
                str3 = clarifyingCardInterpretation.drawMessageId;
            }
            if ((i & 8) != 0) {
                str4 = clarifyingCardInterpretation.requestMessageId;
            }
            return clarifyingCardInterpretation.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ClarifyingCardInterpretation self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.id);
            output.w(serialDesc, 1, self.text);
            output.w(serialDesc, 2, self.drawMessageId);
            output.w(serialDesc, 3, self.requestMessageId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDrawMessageId() {
            return this.drawMessageId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRequestMessageId() {
            return this.requestMessageId;
        }

        public final ClarifyingCardInterpretation copy(String id, String text, String drawMessageId, String requestMessageId) {
            id.getClass();
            text.getClass();
            drawMessageId.getClass();
            requestMessageId.getClass();
            return new ClarifyingCardInterpretation(id, text, drawMessageId, requestMessageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClarifyingCardInterpretation)) {
                return false;
            }
            ClarifyingCardInterpretation clarifyingCardInterpretation = (ClarifyingCardInterpretation) other;
            return pa7.t(this.id, clarifyingCardInterpretation.id) && pa7.t(this.text, clarifyingCardInterpretation.text) && pa7.t(this.drawMessageId, clarifyingCardInterpretation.drawMessageId) && pa7.t(this.requestMessageId, clarifyingCardInterpretation.requestMessageId);
        }

        public final String getDrawMessageId() {
            return this.drawMessageId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getRequestMessageId() {
            return this.requestMessageId;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.requestMessageId.hashCode() + ub3.c(ub3.c(this.id.hashCode() * 31, 31, this.text), 31, this.drawMessageId);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.text;
            return ks0.m(ib8.o("ClarifyingCardInterpretation(id=", str, ", text=", str2, ", drawMessageId="), this.drawMessageId, ", requestMessageId=", this.requestMessageId, ")");
        }

        public ClarifyingCardInterpretation(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.id = str;
            this.text = str2;
            this.drawMessageId = str3;
            this.requestMessageId = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$AssistantMessage;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "text", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$AssistantMessage;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$AssistantMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getId", "Companion", "ai/askquin/ui/persistence/serialization/v", "ai/askquin/ui/persistence/serialization/w", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class AssistantMessage implements SerializableMessage {
        public static final int $stable = 0;
        public static final w Companion = new w();
        private final String id;
        private final String text;

        public /* synthetic */ AssistantMessage(int i, String str, String str2, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, v.a.e());
                throw null;
            }
            this.text = str;
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
        }

        public static /* synthetic */ AssistantMessage copy$default(AssistantMessage assistantMessage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assistantMessage.text;
            }
            if ((i & 2) != 0) {
                str2 = assistantMessage.id;
            }
            return assistantMessage.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(AssistantMessage self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.text);
            if (!output.g(serialDesc) && self.id == null) {
                return;
            }
            output.A(serialDesc, 1, p4e.a, self.id);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final AssistantMessage copy(String text, String id) {
            text.getClass();
            return new AssistantMessage(text, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssistantMessage)) {
                return false;
            }
            AssistantMessage assistantMessage = (AssistantMessage) other;
            return pa7.t(this.text, assistantMessage.text) && pa7.t(this.id, assistantMessage.id);
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.id;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return tec.m("AssistantMessage(text=", this.text, ", id=", this.id, ")");
        }

        public AssistantMessage(String str, String str2) {
            str.getClass();
            this.text = str;
            this.id = str2;
        }

        public /* synthetic */ AssistantMessage(String str, String str2, int i, rp3 rp3Var) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$UserMessage;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "text", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$UserMessage;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$UserMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getId", "Companion", "ai/askquin/ui/persistence/serialization/o0", "ai/askquin/ui/persistence/serialization/p0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class UserMessage implements SerializableMessage {
        public static final int $stable = 0;
        public static final p0 Companion = new p0();
        private final String id;
        private final String text;

        public /* synthetic */ UserMessage(int i, String str, String str2, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, o0.a.e());
                throw null;
            }
            this.text = str;
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
        }

        public static /* synthetic */ UserMessage copy$default(UserMessage userMessage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userMessage.text;
            }
            if ((i & 2) != 0) {
                str2 = userMessage.id;
            }
            return userMessage.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UserMessage self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.text);
            if (!output.g(serialDesc) && self.id == null) {
                return;
            }
            output.A(serialDesc, 1, p4e.a, self.id);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final UserMessage copy(String text, String id) {
            text.getClass();
            return new UserMessage(text, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserMessage)) {
                return false;
            }
            UserMessage userMessage = (UserMessage) other;
            return pa7.t(this.text, userMessage.text) && pa7.t(this.id, userMessage.id);
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.id;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return tec.m("UserMessage(text=", this.text, ", id=", this.id, ")");
        }

        public UserMessage(String str, String str2) {
            str.getClass();
            this.text = str;
            this.id = str2;
        }

        public /* synthetic */ UserMessage(String str, String str2, int i, rp3 rp3Var) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$CardExplanation;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "text", "", "finished", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$CardExplanation;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lai/askquin/ui/persistence/serialization/SerializableMessage$CardExplanation;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getText", "Z", "getFinished", "Companion", "ai/askquin/ui/persistence/serialization/z", "ai/askquin/ui/persistence/serialization/a0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardExplanation implements SerializableMessage {
        public static final int $stable = 0;
        public static final a0 Companion = new a0();
        private final boolean finished;
        private final String id;
        private final String text;

        public /* synthetic */ CardExplanation(int i, String str, String str2, boolean z, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, z.a.e());
                throw null;
            }
            this.id = str;
            this.text = str2;
            if ((i & 4) == 0) {
                this.finished = true;
            } else {
                this.finished = z;
            }
        }

        public static /* synthetic */ CardExplanation copy$default(CardExplanation cardExplanation, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardExplanation.id;
            }
            if ((i & 2) != 0) {
                str2 = cardExplanation.text;
            }
            if ((i & 4) != 0) {
                z = cardExplanation.finished;
            }
            return cardExplanation.copy(str, str2, z);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardExplanation self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.id);
            output.w(serialDesc, 1, self.text);
            if (!output.g(serialDesc) && self.finished) {
                return;
            }
            output.o(serialDesc, 2, self.finished);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final CardExplanation copy(String id, String text, boolean finished) {
            id.getClass();
            text.getClass();
            return new CardExplanation(id, text, finished);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardExplanation)) {
                return false;
            }
            CardExplanation cardExplanation = (CardExplanation) other;
            return pa7.t(this.id, cardExplanation.id) && pa7.t(this.text, cardExplanation.text) && this.finished == cardExplanation.finished;
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
            return Boolean.hashCode(this.finished) + ub3.c(this.id.hashCode() * 31, 31, this.text);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.text;
            return ub3.m(ib8.o("CardExplanation(id=", str, ", text=", str2, ", finished="), this.finished, ")");
        }

        public CardExplanation(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.text = str2;
            this.finished = z;
        }

        public /* synthetic */ CardExplanation(String str, String str2, boolean z, int i, rp3 rp3Var) {
            this(str, str2, (i & 4) != 0 ? true : z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardDraw;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "requestMessageId", "interpretationMessageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardDraw;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardDraw;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getCards", "getRequestMessageId", "getInterpretationMessageId", "Companion", "ai/askquin/ui/persistence/serialization/b0", "ai/askquin/ui/persistence/serialization/c0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ClarifyingCardDraw implements SerializableMessage {
        public static final int $stable = 8;
        private final List<TarotCardChoice> cards;
        private final String id;
        private final String interpretationMessageId;
        private final String requestMessageId;
        public static final c0 Companion = new c0();
        private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new gpc(20)), null, null};

        public /* synthetic */ ClarifyingCardDraw(int i, String str, List list, String str2, String str3, xyc xycVar) {
            if (7 != (i & 7)) {
                an1.R(i, 7, b0.a.e());
                throw null;
            }
            this.id = str;
            this.cards = list;
            this.requestMessageId = str2;
            if ((i & 8) == 0) {
                this.interpretationMessageId = null;
            } else {
                this.interpretationMessageId = str3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return new dd0(rhe.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClarifyingCardDraw copy$default(ClarifyingCardDraw clarifyingCardDraw, String str, List list, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clarifyingCardDraw.id;
            }
            if ((i & 2) != 0) {
                list = clarifyingCardDraw.cards;
            }
            if ((i & 4) != 0) {
                str2 = clarifyingCardDraw.requestMessageId;
            }
            if ((i & 8) != 0) {
                str3 = clarifyingCardDraw.interpretationMessageId;
            }
            return clarifyingCardDraw.copy(str, list, str2, str3);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ClarifyingCardDraw self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.id);
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cards);
            output.w(serialDesc, 2, self.requestMessageId);
            if (!output.g(serialDesc) && self.interpretationMessageId == null) {
                return;
            }
            output.A(serialDesc, 3, p4e.a, self.interpretationMessageId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<TarotCardChoice> component2() {
            return this.cards;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRequestMessageId() {
            return this.requestMessageId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getInterpretationMessageId() {
            return this.interpretationMessageId;
        }

        public final ClarifyingCardDraw copy(String id, List<TarotCardChoice> cards, String requestMessageId, String interpretationMessageId) {
            id.getClass();
            cards.getClass();
            requestMessageId.getClass();
            return new ClarifyingCardDraw(id, cards, requestMessageId, interpretationMessageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClarifyingCardDraw)) {
                return false;
            }
            ClarifyingCardDraw clarifyingCardDraw = (ClarifyingCardDraw) other;
            return pa7.t(this.id, clarifyingCardDraw.id) && pa7.t(this.cards, clarifyingCardDraw.cards) && pa7.t(this.requestMessageId, clarifyingCardDraw.requestMessageId) && pa7.t(this.interpretationMessageId, clarifyingCardDraw.interpretationMessageId);
        }

        public final List<TarotCardChoice> getCards() {
            return this.cards;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInterpretationMessageId() {
            return this.interpretationMessageId;
        }

        public final String getRequestMessageId() {
            return this.requestMessageId;
        }

        public int hashCode() {
            int iC = ub3.c(tec.a(this.id.hashCode() * 31, 31, this.cards), 31, this.requestMessageId);
            String str = this.interpretationMessageId;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.id;
            List<TarotCardChoice> list = this.cards;
            String str2 = this.requestMessageId;
            String str3 = this.interpretationMessageId;
            StringBuilder sb = new StringBuilder("ClarifyingCardDraw(id=");
            sb.append(str);
            sb.append(", cards=");
            sb.append(list);
            sb.append(", requestMessageId=");
            return ks0.m(sb, str2, ", interpretationMessageId=", str3, ")");
        }

        public ClarifyingCardDraw(String str, List<TarotCardChoice> list, String str2, String str3) {
            str.getClass();
            list.getClass();
            str2.getClass();
            this.id = str;
            this.cards = list;
            this.requestMessageId = str2;
            this.interpretationMessageId = str3;
        }

        public /* synthetic */ ClarifyingCardDraw(String str, List list, String str2, String str3, int i, rp3 rp3Var) {
            this(str, list, str2, (i & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$NewReadingRequest;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "question", "childReadingId", "Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;", "childReading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$NewReadingRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;)Lai/askquin/ui/persistence/serialization/SerializableMessage$NewReadingRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getQuestion", "getChildReadingId", "Lai/askquin/ui/persistence/serialization/SerializableLinkedReadingSnapshot;", "getChildReading", "Companion", "ai/askquin/ui/persistence/serialization/i0", "ai/askquin/ui/persistence/serialization/j0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class NewReadingRequest implements SerializableMessage {
        public static final int $stable = 0;
        public static final j0 Companion = new j0();
        private final SerializableLinkedReadingSnapshot childReading;
        private final String childReadingId;
        private final String id;
        private final String question;

        public /* synthetic */ NewReadingRequest(int i, String str, String str2, String str3, SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, i0.a.e());
                throw null;
            }
            this.id = str;
            this.question = str2;
            if ((i & 4) == 0) {
                this.childReadingId = null;
            } else {
                this.childReadingId = str3;
            }
            if ((i & 8) == 0) {
                this.childReading = null;
            } else {
                this.childReading = serializableLinkedReadingSnapshot;
            }
        }

        public static /* synthetic */ NewReadingRequest copy$default(NewReadingRequest newReadingRequest, String str, String str2, String str3, SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newReadingRequest.id;
            }
            if ((i & 2) != 0) {
                str2 = newReadingRequest.question;
            }
            if ((i & 4) != 0) {
                str3 = newReadingRequest.childReadingId;
            }
            if ((i & 8) != 0) {
                serializableLinkedReadingSnapshot = newReadingRequest.childReading;
            }
            return newReadingRequest.copy(str, str2, str3, serializableLinkedReadingSnapshot);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(NewReadingRequest self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.id);
            output.w(serialDesc, 1, self.question);
            if (output.g(serialDesc) || self.childReadingId != null) {
                output.A(serialDesc, 2, p4e.a, self.childReadingId);
            }
            if (!output.g(serialDesc) && self.childReading == null) {
                return;
            }
            output.A(serialDesc, 3, u.a, self.childReading);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
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
        public final SerializableLinkedReadingSnapshot getChildReading() {
            return this.childReading;
        }

        public final NewReadingRequest copy(String id, String question, String childReadingId, SerializableLinkedReadingSnapshot childReading) {
            id.getClass();
            question.getClass();
            return new NewReadingRequest(id, question, childReadingId, childReading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewReadingRequest)) {
                return false;
            }
            NewReadingRequest newReadingRequest = (NewReadingRequest) other;
            return pa7.t(this.id, newReadingRequest.id) && pa7.t(this.question, newReadingRequest.question) && pa7.t(this.childReadingId, newReadingRequest.childReadingId) && pa7.t(this.childReading, newReadingRequest.childReading);
        }

        public final SerializableLinkedReadingSnapshot getChildReading() {
            return this.childReading;
        }

        public final String getChildReadingId() {
            return this.childReadingId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            int iC = ub3.c(this.id.hashCode() * 31, 31, this.question);
            String str = this.childReadingId;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot = this.childReading;
            return iHashCode + (serializableLinkedReadingSnapshot != null ? serializableLinkedReadingSnapshot.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.question;
            String str3 = this.childReadingId;
            SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot = this.childReading;
            StringBuilder sbO = ib8.o("NewReadingRequest(id=", str, ", question=", str2, ", childReadingId=");
            sbO.append(str3);
            sbO.append(", childReading=");
            sbO.append(serializableLinkedReadingSnapshot);
            sbO.append(")");
            return sbO.toString();
        }

        public NewReadingRequest(String str, String str2, String str3, SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.question = str2;
            this.childReadingId = str3;
            this.childReading = serializableLinkedReadingSnapshot;
        }

        public /* synthetic */ NewReadingRequest(String str, String str2, String str3, SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot, int i, rp3 rp3Var) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : serializableLinkedReadingSnapshot);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardRequest;", "Lai/askquin/ui/persistence/serialization/SerializableMessage;", "", "id", "label", "", "ignored", "drawMessageId", "interpretationMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableMessage$ClarifyingCardRequest;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "Z", "getIgnored", "getDrawMessageId", "getInterpretationMessageId", "Companion", "ai/askquin/ui/persistence/serialization/f0", "ai/askquin/ui/persistence/serialization/g0", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ClarifyingCardRequest implements SerializableMessage {
        public static final int $stable = 0;
        public static final g0 Companion = new g0();
        private final String drawMessageId;
        private final String id;
        private final boolean ignored;
        private final String interpretationMessageId;
        private final String label;

        public /* synthetic */ ClarifyingCardRequest(int i, String str, String str2, boolean z, String str3, String str4, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, f0.a.e());
                throw null;
            }
            this.id = str;
            this.label = str2;
            if ((i & 4) == 0) {
                this.ignored = false;
            } else {
                this.ignored = z;
            }
            if ((i & 8) == 0) {
                this.drawMessageId = null;
            } else {
                this.drawMessageId = str3;
            }
            if ((i & 16) == 0) {
                this.interpretationMessageId = null;
            } else {
                this.interpretationMessageId = str4;
            }
        }

        public static /* synthetic */ ClarifyingCardRequest copy$default(ClarifyingCardRequest clarifyingCardRequest, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clarifyingCardRequest.id;
            }
            if ((i & 2) != 0) {
                str2 = clarifyingCardRequest.label;
            }
            if ((i & 4) != 0) {
                z = clarifyingCardRequest.ignored;
            }
            if ((i & 8) != 0) {
                str3 = clarifyingCardRequest.drawMessageId;
            }
            if ((i & 16) != 0) {
                str4 = clarifyingCardRequest.interpretationMessageId;
            }
            String str5 = str4;
            boolean z2 = z;
            return clarifyingCardRequest.copy(str, str2, z2, str3, str5);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ClarifyingCardRequest self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.id);
            output.w(serialDesc, 1, self.label);
            if (output.g(serialDesc) || self.ignored) {
                output.o(serialDesc, 2, self.ignored);
            }
            if (output.g(serialDesc) || self.drawMessageId != null) {
                output.A(serialDesc, 3, p4e.a, self.drawMessageId);
            }
            if (!output.g(serialDesc) && self.interpretationMessageId == null) {
                return;
            }
            output.A(serialDesc, 4, p4e.a, self.interpretationMessageId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIgnored() {
            return this.ignored;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDrawMessageId() {
            return this.drawMessageId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getInterpretationMessageId() {
            return this.interpretationMessageId;
        }

        public final ClarifyingCardRequest copy(String id, String label, boolean ignored, String drawMessageId, String interpretationMessageId) {
            id.getClass();
            label.getClass();
            return new ClarifyingCardRequest(id, label, ignored, drawMessageId, interpretationMessageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClarifyingCardRequest)) {
                return false;
            }
            ClarifyingCardRequest clarifyingCardRequest = (ClarifyingCardRequest) other;
            return pa7.t(this.id, clarifyingCardRequest.id) && pa7.t(this.label, clarifyingCardRequest.label) && this.ignored == clarifyingCardRequest.ignored && pa7.t(this.drawMessageId, clarifyingCardRequest.drawMessageId) && pa7.t(this.interpretationMessageId, clarifyingCardRequest.interpretationMessageId);
        }

        public final String getDrawMessageId() {
            return this.drawMessageId;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getIgnored() {
            return this.ignored;
        }

        public final String getInterpretationMessageId() {
            return this.interpretationMessageId;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iD = ub3.d(ub3.c(this.id.hashCode() * 31, 31, this.label), 31, this.ignored);
            String str = this.drawMessageId;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.interpretationMessageId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.label;
            boolean z = this.ignored;
            String str3 = this.drawMessageId;
            String str4 = this.interpretationMessageId;
            StringBuilder sbO = ib8.o("ClarifyingCardRequest(id=", str, ", label=", str2, ", ignored=");
            sbO.append(z);
            sbO.append(", drawMessageId=");
            sbO.append(str3);
            sbO.append(", interpretationMessageId=");
            return ks0.l(sbO, str4, ")");
        }

        public ClarifyingCardRequest(String str, String str2, boolean z, String str3, String str4) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.label = str2;
            this.ignored = z;
            this.drawMessageId = str3;
            this.interpretationMessageId = str4;
        }

        public /* synthetic */ ClarifyingCardRequest(String str, String str2, boolean z, String str3, String str4, int i, rp3 rp3Var) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }
}
