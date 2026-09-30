package tech.chatmind.api.events.model;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.job;
import defpackage.ks0;
import defpackage.kz4;
import defpackage.lw7;
import defpackage.mz4;
import defpackage.nyc;
import defpackage.nz4;
import defpackage.oz4;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.sja;
import defpackage.tyc;
import defpackage.v74;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MNBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bF\u0010\u001aR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bK\u0010\u001a¨\u0006O"}, d2 = {"Ltech/chatmind/api/events/model/EventInfo;", "", "", "id", "Ltech/chatmind/api/events/model/EventType;", "type", "Ljava/time/OffsetDateTime;", "startAt", "endAt", "Ltech/chatmind/api/events/model/EventImageAction;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "pattern", "", "Ltech/chatmind/api/PatternData;", "patternData", "Ltech/chatmind/api/events/model/Popup;", "popup", "recommendQuestion", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/events/model/EventType;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ltech/chatmind/api/events/model/EventImageAction;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/events/model/Popup;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/events/model/EventType;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ltech/chatmind/api/events/model/EventImageAction;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/events/model/Popup;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/events/model/EventType;", "component3", "()Ljava/time/OffsetDateTime;", "component4", "component5", "()Ltech/chatmind/api/events/model/EventImageAction;", "component6", "component7", "()Ljava/util/List;", "component8", "()Ltech/chatmind/api/events/model/Popup;", "component9", "copy", "(Ljava/lang/String;Ltech/chatmind/api/events/model/EventType;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ltech/chatmind/api/events/model/EventImageAction;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/events/model/Popup;Ljava/lang/String;)Ltech/chatmind/api/events/model/EventInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/EventInfo;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getId", "Ltech/chatmind/api/events/model/EventType;", "getType", "Ljava/time/OffsetDateTime;", "getStartAt", "getStartAt$annotations", "()V", "getEndAt", "getEndAt$annotations", "Ltech/chatmind/api/events/model/EventImageAction;", "getInfo", "getPattern", "Ljava/util/List;", "getPatternData", "Ltech/chatmind/api/events/model/Popup;", "getPopup", "getRecommendQuestion", "Companion", "nz4", "oz4", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class EventInfo {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final oz4 Companion = new oz4();
    private final OffsetDateTime endAt;
    private final String id;
    private final EventImageAction info;
    private final String pattern;
    private final List<PatternData> patternData;
    private final Popup popup;
    private final String recommendQuestion;
    private final OffsetDateTime startAt;
    private final EventType type;

    static {
        v74 v74Var = new v74(27);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, v74Var), eb3.N(z18Var, new v74(28)), eb3.N(z18Var, new v74(29)), null, null, eb3.N(z18Var, new mz4(0)), null, null};
    }

    public /* synthetic */ EventInfo(int i, String str, EventType eventType, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, EventImageAction eventImageAction, String str2, List list, Popup popup, String str3, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, nz4.a.e());
            throw null;
        }
        this.id = str;
        this.type = eventType;
        this.startAt = offsetDateTime;
        this.endAt = offsetDateTime2;
        if ((i & 16) == 0) {
            this.info = null;
        } else {
            this.info = eventImageAction;
        }
        if ((i & 32) == 0) {
            this.pattern = null;
        } else {
            this.pattern = str2;
        }
        if ((i & 64) == 0) {
            this.patternData = null;
        } else {
            this.patternData = list;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.popup = null;
        } else {
            this.popup = popup;
        }
        if ((i & 256) == 0) {
            this.recommendQuestion = null;
        } else {
            this.recommendQuestion = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return EventType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$0() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$1() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$2() {
        return new dd0(g2a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventInfo copy$default(EventInfo eventInfo, String str, EventType eventType, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, EventImageAction eventImageAction, String str2, List list, Popup popup, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventInfo.id;
        }
        if ((i & 2) != 0) {
            eventType = eventInfo.type;
        }
        if ((i & 4) != 0) {
            offsetDateTime = eventInfo.startAt;
        }
        if ((i & 8) != 0) {
            offsetDateTime2 = eventInfo.endAt;
        }
        if ((i & 16) != 0) {
            eventImageAction = eventInfo.info;
        }
        if ((i & 32) != 0) {
            str2 = eventInfo.pattern;
        }
        if ((i & 64) != 0) {
            list = eventInfo.patternData;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            popup = eventInfo.popup;
        }
        if ((i & 256) != 0) {
            str3 = eventInfo.recommendQuestion;
        }
        Popup popup2 = popup;
        String str4 = str3;
        String str5 = str2;
        List list2 = list;
        EventImageAction eventImageAction2 = eventImageAction;
        OffsetDateTime offsetDateTime3 = offsetDateTime;
        return eventInfo.copy(str, eventType, offsetDateTime3, offsetDateTime2, eventImageAction2, str5, list2, popup2, str4);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(EventInfo self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.id);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.type);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.startAt);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.endAt);
        if (output.g(serialDesc) || self.info != null) {
            output.A(serialDesc, 4, kz4.a, self.info);
        }
        if (output.g(serialDesc) || self.pattern != null) {
            output.A(serialDesc, 5, p4e.a, self.pattern);
        }
        if (output.g(serialDesc) || self.patternData != null) {
            output.A(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.patternData);
        }
        if (output.g(serialDesc) || self.popup != null) {
            output.A(serialDesc, 7, sja.a, self.popup);
        }
        if (!output.g(serialDesc) && self.recommendQuestion == null) {
            return;
        }
        output.A(serialDesc, 8, p4e.a, self.recommendQuestion);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getStartAt() {
        return this.startAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getEndAt() {
        return this.endAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EventImageAction getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    public final List<PatternData> component7() {
        return this.patternData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Popup getPopup() {
        return this.popup;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecommendQuestion() {
        return this.recommendQuestion;
    }

    public final EventInfo copy(String id, EventType type, OffsetDateTime startAt, OffsetDateTime endAt, EventImageAction info, String pattern, List<PatternData> patternData, Popup popup, String recommendQuestion) {
        id.getClass();
        type.getClass();
        startAt.getClass();
        endAt.getClass();
        return new EventInfo(id, type, startAt, endAt, info, pattern, patternData, popup, recommendQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventInfo)) {
            return false;
        }
        EventInfo eventInfo = (EventInfo) other;
        return pa7.t(this.id, eventInfo.id) && this.type == eventInfo.type && pa7.t(this.startAt, eventInfo.startAt) && pa7.t(this.endAt, eventInfo.endAt) && pa7.t(this.info, eventInfo.info) && pa7.t(this.pattern, eventInfo.pattern) && pa7.t(this.patternData, eventInfo.patternData) && pa7.t(this.popup, eventInfo.popup) && pa7.t(this.recommendQuestion, eventInfo.recommendQuestion);
    }

    public final OffsetDateTime getEndAt() {
        return this.endAt;
    }

    public final String getId() {
        return this.id;
    }

    public final EventImageAction getInfo() {
        return this.info;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final List<PatternData> getPatternData() {
        return this.patternData;
    }

    public final Popup getPopup() {
        return this.popup;
    }

    public final String getRecommendQuestion() {
        return this.recommendQuestion;
    }

    public final OffsetDateTime getStartAt() {
        return this.startAt;
    }

    public final EventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.endAt.hashCode() + ((this.startAt.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31;
        EventImageAction eventImageAction = this.info;
        int iHashCode2 = (iHashCode + (eventImageAction == null ? 0 : eventImageAction.hashCode())) * 31;
        String str = this.pattern;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<PatternData> list = this.patternData;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Popup popup = this.popup;
        int iHashCode5 = (iHashCode4 + (popup == null ? 0 : popup.hashCode())) * 31;
        String str2 = this.recommendQuestion;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EventType eventType = this.type;
        OffsetDateTime offsetDateTime = this.startAt;
        OffsetDateTime offsetDateTime2 = this.endAt;
        EventImageAction eventImageAction = this.info;
        String str2 = this.pattern;
        List<PatternData> list = this.patternData;
        Popup popup = this.popup;
        String str3 = this.recommendQuestion;
        StringBuilder sb = new StringBuilder("EventInfo(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(eventType);
        sb.append(", startAt=");
        sb.append(offsetDateTime);
        sb.append(", endAt=");
        sb.append(offsetDateTime2);
        sb.append(", info=");
        sb.append(eventImageAction);
        sb.append(", pattern=");
        sb.append(str2);
        sb.append(", patternData=");
        sb.append(list);
        sb.append(", popup=");
        sb.append(popup);
        sb.append(", recommendQuestion=");
        return ks0.l(sb, str3, ")");
    }

    public static /* synthetic */ void getEndAt$annotations() {
    }

    public static /* synthetic */ void getStartAt$annotations() {
    }

    public EventInfo(String str, EventType eventType, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, EventImageAction eventImageAction, String str2, List<PatternData> list, Popup popup, String str3) {
        str.getClass();
        eventType.getClass();
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        this.id = str;
        this.type = eventType;
        this.startAt = offsetDateTime;
        this.endAt = offsetDateTime2;
        this.info = eventImageAction;
        this.pattern = str2;
        this.patternData = list;
        this.popup = popup;
        this.recommendQuestion = str3;
    }

    public /* synthetic */ EventInfo(String str, EventType eventType, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, EventImageAction eventImageAction, String str2, List list, Popup popup, String str3, int i, rp3 rp3Var) {
        this(str, eventType, offsetDateTime, offsetDateTime2, (i & 16) != 0 ? null : eventImageAction, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : list, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : popup, (i & 256) != 0 ? null : str3);
    }
}
