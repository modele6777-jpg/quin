package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.cje;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.eje;
import defpackage.hje;
import defpackage.ib8;
import defpackage.lje;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nje;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uie;
import defpackage.vke;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yie;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_`B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aB\u00ad\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b4\u00105J¸\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010!J\u0010\u00109\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bJ\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bK\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bL\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bX\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bY\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bZ\u0010!R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\b[\u0010!R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u00105¨\u0006a"}, d2 = {"Ltech/chatmind/api/TarotReadingHistory;", "", "", "chatId", "createdTime", "updatedTime", "tarotRole", "Ltech/chatmind/api/TarotReadingQuestionHistory;", "question", "Ltech/chatmind/api/TarotReadingSpreadHistory;", "spread", "Ltech/chatmind/api/TarotReadingBody;", "reading", "Ltech/chatmind/api/TarotReadingChatState;", "chat", "Ltech/chatmind/api/TarotReadingAdditionalInfo;", "additionalInfo", "Ltech/chatmind/api/TarotReadingMetadata;", "metadata", "uid", "type", "scenarioId", "", "Ltech/chatmind/api/TarotReadingAsset;", "assets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotReadingQuestionHistory;Ltech/chatmind/api/TarotReadingSpreadHistory;Ltech/chatmind/api/TarotReadingBody;Ltech/chatmind/api/TarotReadingChatState;Ltech/chatmind/api/TarotReadingAdditionalInfo;Ltech/chatmind/api/TarotReadingMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotReadingQuestionHistory;Ltech/chatmind/api/TarotReadingSpreadHistory;Ltech/chatmind/api/TarotReadingBody;Ltech/chatmind/api/TarotReadingChatState;Ltech/chatmind/api/TarotReadingAdditionalInfo;Ltech/chatmind/api/TarotReadingMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ltech/chatmind/api/TarotReadingQuestionHistory;", "component6", "()Ltech/chatmind/api/TarotReadingSpreadHistory;", "component7", "()Ltech/chatmind/api/TarotReadingBody;", "component8", "()Ltech/chatmind/api/TarotReadingChatState;", "component9", "()Ltech/chatmind/api/TarotReadingAdditionalInfo;", "component10", "()Ltech/chatmind/api/TarotReadingMetadata;", "component11", "component12", "component13", "component14", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotReadingQuestionHistory;Ltech/chatmind/api/TarotReadingSpreadHistory;Ltech/chatmind/api/TarotReadingBody;Ltech/chatmind/api/TarotReadingChatState;Ltech/chatmind/api/TarotReadingAdditionalInfo;Ltech/chatmind/api/TarotReadingMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ltech/chatmind/api/TarotReadingHistory;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingHistory;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getChatId", "getCreatedTime", "getUpdatedTime", "getTarotRole", "Ltech/chatmind/api/TarotReadingQuestionHistory;", "getQuestion", "Ltech/chatmind/api/TarotReadingSpreadHistory;", "getSpread", "Ltech/chatmind/api/TarotReadingBody;", "getReading", "Ltech/chatmind/api/TarotReadingChatState;", "getChat", "Ltech/chatmind/api/TarotReadingAdditionalInfo;", "getAdditionalInfo", "Ltech/chatmind/api/TarotReadingMetadata;", "getMetadata", "getUid", "getType", "getScenarioId", "Ljava/util/List;", "getAssets", "Companion", "gje", "hje", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingHistory {
    private static final lw7[] $childSerializers;
    public static final int $stable;
    public static final hje Companion = new hje();
    private final TarotReadingAdditionalInfo additionalInfo;
    private final List<TarotReadingAsset> assets;
    private final TarotReadingChatState chat;
    private final String chatId;
    private final String createdTime;
    private final TarotReadingMetadata metadata;
    private final TarotReadingQuestionHistory question;
    private final TarotReadingBody reading;
    private final String scenarioId;
    private final TarotReadingSpreadHistory spread;
    private final String tarotRole;
    private final String type;
    private final String uid;
    private final String updatedTime;

    static {
        int i = CloudMixedDeckSnapshot.$stable;
        int i2 = AdditionalInfoAudio.$stable;
        $stable = i | i2 | i2 | AiRecommendResponse.$stable;
        $childSerializers = new lw7[]{null, null, null, null, null, null, null, null, null, null, null, null, null, eb3.N(z18.b, new mie(4))};
    }

    public /* synthetic */ TarotReadingHistory(String str, String str2, String str3, String str4, TarotReadingQuestionHistory tarotReadingQuestionHistory, TarotReadingSpreadHistory tarotReadingSpreadHistory, TarotReadingBody tarotReadingBody, TarotReadingChatState tarotReadingChatState, TarotReadingAdditionalInfo tarotReadingAdditionalInfo, TarotReadingMetadata tarotReadingMetadata, String str5, String str6, String str7, List list, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : tarotReadingQuestionHistory, (i & 32) != 0 ? null : tarotReadingSpreadHistory, (i & 64) != 0 ? null : tarotReadingBody, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : tarotReadingChatState, (i & 256) != 0 ? null : tarotReadingAdditionalInfo, (i & 512) != 0 ? null : tarotReadingMetadata, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(yie.a, 0);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingHistory self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.chatId, "")) {
            output.w(serialDesc, 0, self.chatId);
        }
        if (output.g(serialDesc) || !pa7.t(self.createdTime, "")) {
            output.w(serialDesc, 1, self.createdTime);
        }
        if (output.g(serialDesc) || !pa7.t(self.updatedTime, "")) {
            output.w(serialDesc, 2, self.updatedTime);
        }
        if (output.g(serialDesc) || self.tarotRole != null) {
            output.A(serialDesc, 3, p4e.a, self.tarotRole);
        }
        if (output.g(serialDesc) || self.question != null) {
            output.A(serialDesc, 4, nje.a, self.question);
        }
        if (output.g(serialDesc) || self.spread != null) {
            output.A(serialDesc, 5, vke.a, self.spread);
        }
        if (output.g(serialDesc) || self.reading != null) {
            output.A(serialDesc, 6, cje.a, self.reading);
        }
        if (output.g(serialDesc) || self.chat != null) {
            output.A(serialDesc, 7, eje.a, self.chat);
        }
        if (output.g(serialDesc) || self.additionalInfo != null) {
            output.A(serialDesc, 8, uie.a, self.additionalInfo);
        }
        if (output.g(serialDesc) || self.metadata != null) {
            output.A(serialDesc, 9, lje.a, self.metadata);
        }
        if (output.g(serialDesc) || self.uid != null) {
            output.A(serialDesc, 10, p4e.a, self.uid);
        }
        if (output.g(serialDesc) || self.type != null) {
            output.A(serialDesc, 11, p4e.a, self.type);
        }
        if (output.g(serialDesc) || self.scenarioId != null) {
            output.A(serialDesc, 12, p4e.a, self.scenarioId);
        }
        if (!output.g(serialDesc) && self.assets == null) {
            return;
        }
        output.A(serialDesc, 13, (xn7) lw7VarArr[13].getValue(), self.assets);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TarotReadingMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final List<TarotReadingAsset> component14() {
        return this.assets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTarotRole() {
        return this.tarotRole;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TarotReadingQuestionHistory getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TarotReadingSpreadHistory getSpread() {
        return this.spread;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TarotReadingBody getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TarotReadingChatState getChat() {
        return this.chat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TarotReadingAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final TarotReadingHistory copy(String chatId, String createdTime, String updatedTime, String tarotRole, TarotReadingQuestionHistory question, TarotReadingSpreadHistory spread, TarotReadingBody reading, TarotReadingChatState chat, TarotReadingAdditionalInfo additionalInfo, TarotReadingMetadata metadata, String uid, String type, String scenarioId, List<TarotReadingAsset> assets) {
        chatId.getClass();
        createdTime.getClass();
        updatedTime.getClass();
        return new TarotReadingHistory(chatId, createdTime, updatedTime, tarotRole, question, spread, reading, chat, additionalInfo, metadata, uid, type, scenarioId, assets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingHistory)) {
            return false;
        }
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) other;
        return pa7.t(this.chatId, tarotReadingHistory.chatId) && pa7.t(this.createdTime, tarotReadingHistory.createdTime) && pa7.t(this.updatedTime, tarotReadingHistory.updatedTime) && pa7.t(this.tarotRole, tarotReadingHistory.tarotRole) && pa7.t(this.question, tarotReadingHistory.question) && pa7.t(this.spread, tarotReadingHistory.spread) && pa7.t(this.reading, tarotReadingHistory.reading) && pa7.t(this.chat, tarotReadingHistory.chat) && pa7.t(this.additionalInfo, tarotReadingHistory.additionalInfo) && pa7.t(this.metadata, tarotReadingHistory.metadata) && pa7.t(this.uid, tarotReadingHistory.uid) && pa7.t(this.type, tarotReadingHistory.type) && pa7.t(this.scenarioId, tarotReadingHistory.scenarioId) && pa7.t(this.assets, tarotReadingHistory.assets);
    }

    public final TarotReadingAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final List<TarotReadingAsset> getAssets() {
        return this.assets;
    }

    public final TarotReadingChatState getChat() {
        return this.chat;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final TarotReadingMetadata getMetadata() {
        return this.metadata;
    }

    public final TarotReadingQuestionHistory getQuestion() {
        return this.question;
    }

    public final TarotReadingBody getReading() {
        return this.reading;
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final TarotReadingSpreadHistory getSpread() {
        return this.spread;
    }

    public final String getTarotRole() {
        return this.tarotRole;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(this.chatId.hashCode() * 31, 31, this.createdTime), 31, this.updatedTime);
        String str = this.tarotRole;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        TarotReadingQuestionHistory tarotReadingQuestionHistory = this.question;
        int iHashCode2 = (iHashCode + (tarotReadingQuestionHistory == null ? 0 : tarotReadingQuestionHistory.hashCode())) * 31;
        TarotReadingSpreadHistory tarotReadingSpreadHistory = this.spread;
        int iHashCode3 = (iHashCode2 + (tarotReadingSpreadHistory == null ? 0 : tarotReadingSpreadHistory.hashCode())) * 31;
        TarotReadingBody tarotReadingBody = this.reading;
        int iHashCode4 = (iHashCode3 + (tarotReadingBody == null ? 0 : tarotReadingBody.hashCode())) * 31;
        TarotReadingChatState tarotReadingChatState = this.chat;
        int iHashCode5 = (iHashCode4 + (tarotReadingChatState == null ? 0 : tarotReadingChatState.hashCode())) * 31;
        TarotReadingAdditionalInfo tarotReadingAdditionalInfo = this.additionalInfo;
        int iHashCode6 = (iHashCode5 + (tarotReadingAdditionalInfo == null ? 0 : tarotReadingAdditionalInfo.hashCode())) * 31;
        TarotReadingMetadata tarotReadingMetadata = this.metadata;
        int iHashCode7 = (iHashCode6 + (tarotReadingMetadata == null ? 0 : tarotReadingMetadata.hashCode())) * 31;
        String str2 = this.uid;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scenarioId;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<TarotReadingAsset> list = this.assets;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.createdTime;
        String str3 = this.updatedTime;
        String str4 = this.tarotRole;
        TarotReadingQuestionHistory tarotReadingQuestionHistory = this.question;
        TarotReadingSpreadHistory tarotReadingSpreadHistory = this.spread;
        TarotReadingBody tarotReadingBody = this.reading;
        TarotReadingChatState tarotReadingChatState = this.chat;
        TarotReadingAdditionalInfo tarotReadingAdditionalInfo = this.additionalInfo;
        TarotReadingMetadata tarotReadingMetadata = this.metadata;
        String str5 = this.uid;
        String str6 = this.type;
        String str7 = this.scenarioId;
        List<TarotReadingAsset> list = this.assets;
        StringBuilder sbO = ib8.o("TarotReadingHistory(chatId=", str, ", createdTime=", str2, ", updatedTime=");
        ub3.v(sbO, str3, ", tarotRole=", str4, ", question=");
        sbO.append(tarotReadingQuestionHistory);
        sbO.append(", spread=");
        sbO.append(tarotReadingSpreadHistory);
        sbO.append(", reading=");
        sbO.append(tarotReadingBody);
        sbO.append(", chat=");
        sbO.append(tarotReadingChatState);
        sbO.append(", additionalInfo=");
        sbO.append(tarotReadingAdditionalInfo);
        sbO.append(", metadata=");
        sbO.append(tarotReadingMetadata);
        sbO.append(", uid=");
        ub3.v(sbO, str5, ", type=", str6, ", scenarioId=");
        sbO.append(str7);
        sbO.append(", assets=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    public TarotReadingHistory(String str, String str2, String str3, String str4, TarotReadingQuestionHistory tarotReadingQuestionHistory, TarotReadingSpreadHistory tarotReadingSpreadHistory, TarotReadingBody tarotReadingBody, TarotReadingChatState tarotReadingChatState, TarotReadingAdditionalInfo tarotReadingAdditionalInfo, TarotReadingMetadata tarotReadingMetadata, String str5, String str6, String str7, List<TarotReadingAsset> list) {
        tec.x(str, str2, str3);
        this.chatId = str;
        this.createdTime = str2;
        this.updatedTime = str3;
        this.tarotRole = str4;
        this.question = tarotReadingQuestionHistory;
        this.spread = tarotReadingSpreadHistory;
        this.reading = tarotReadingBody;
        this.chat = tarotReadingChatState;
        this.additionalInfo = tarotReadingAdditionalInfo;
        this.metadata = tarotReadingMetadata;
        this.uid = str5;
        this.type = str6;
        this.scenarioId = str7;
        this.assets = list;
    }

    public /* synthetic */ TarotReadingHistory(int i, String str, String str2, String str3, String str4, TarotReadingQuestionHistory tarotReadingQuestionHistory, TarotReadingSpreadHistory tarotReadingSpreadHistory, TarotReadingBody tarotReadingBody, TarotReadingChatState tarotReadingChatState, TarotReadingAdditionalInfo tarotReadingAdditionalInfo, TarotReadingMetadata tarotReadingMetadata, String str5, String str6, String str7, List list, xyc xycVar) {
        if ((i & 1) == 0) {
            this.chatId = "";
        } else {
            this.chatId = str;
        }
        if ((i & 2) == 0) {
            this.createdTime = "";
        } else {
            this.createdTime = str2;
        }
        if ((i & 4) == 0) {
            this.updatedTime = "";
        } else {
            this.updatedTime = str3;
        }
        if ((i & 8) == 0) {
            this.tarotRole = null;
        } else {
            this.tarotRole = str4;
        }
        if ((i & 16) == 0) {
            this.question = null;
        } else {
            this.question = tarotReadingQuestionHistory;
        }
        if ((i & 32) == 0) {
            this.spread = null;
        } else {
            this.spread = tarotReadingSpreadHistory;
        }
        if ((i & 64) == 0) {
            this.reading = null;
        } else {
            this.reading = tarotReadingBody;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.chat = null;
        } else {
            this.chat = tarotReadingChatState;
        }
        if ((i & 256) == 0) {
            this.additionalInfo = null;
        } else {
            this.additionalInfo = tarotReadingAdditionalInfo;
        }
        if ((i & 512) == 0) {
            this.metadata = null;
        } else {
            this.metadata = tarotReadingMetadata;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.uid = null;
        } else {
            this.uid = str5;
        }
        if ((i & 2048) == 0) {
            this.type = null;
        } else {
            this.type = str6;
        }
        if ((i & 4096) == 0) {
            this.scenarioId = null;
        } else {
            this.scenarioId = str7;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.assets = null;
        } else {
            this.assets = list;
        }
    }

    public TarotReadingHistory() {
        this((String) null, (String) null, (String) null, (String) null, (TarotReadingQuestionHistory) null, (TarotReadingSpreadHistory) null, (TarotReadingBody) null, (TarotReadingChatState) null, (TarotReadingAdditionalInfo) null, (TarotReadingMetadata) null, (String) null, (String) null, (String) null, (List) null, 16383, (rp3) null);
    }
}
