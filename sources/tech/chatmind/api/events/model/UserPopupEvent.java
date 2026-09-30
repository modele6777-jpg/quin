package tech.chatmind.api.events.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.job;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.sja;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.ymf;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zmf;
import java.time.OffsetDateTime;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001e¨\u00066"}, d2 = {"Ltech/chatmind/api/events/model/UserPopupEvent;", "", "", "id", "Ltech/chatmind/api/events/model/Popup;", "popup", "Ljava/time/OffsetDateTime;", "startAt", "endAt", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/events/model/Popup;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/events/model/Popup;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/UserPopupEvent;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/events/model/Popup;", "component3", "()Ljava/time/OffsetDateTime;", "component4", "copy", "(Ljava/lang/String;Ltech/chatmind/api/events/model/Popup;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Ltech/chatmind/api/events/model/UserPopupEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ltech/chatmind/api/events/model/Popup;", "getPopup", "Ljava/time/OffsetDateTime;", "getStartAt", "getStartAt$annotations", "()V", "getEndAt", "getEndAt$annotations", "Companion", "ymf", "zmf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserPopupEvent {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final zmf Companion = new zmf();
    private final OffsetDateTime endAt;
    private final String id;
    private final Popup popup;
    private final OffsetDateTime startAt;

    static {
        ehf ehfVar = new ehf(11);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, ehfVar), eb3.N(z18Var, new ehf(12))};
    }

    public /* synthetic */ UserPopupEvent(int i, String str, Popup popup, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, ymf.a.e());
            throw null;
        }
        this.id = str;
        this.popup = popup;
        this.startAt = offsetDateTime;
        this.endAt = offsetDateTime2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$0() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    public static /* synthetic */ UserPopupEvent copy$default(UserPopupEvent userPopupEvent, String str, Popup popup, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPopupEvent.id;
        }
        if ((i & 2) != 0) {
            popup = userPopupEvent.popup;
        }
        if ((i & 4) != 0) {
            offsetDateTime = userPopupEvent.startAt;
        }
        if ((i & 8) != 0) {
            offsetDateTime2 = userPopupEvent.endAt;
        }
        return userPopupEvent.copy(str, popup, offsetDateTime, offsetDateTime2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UserPopupEvent self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.id);
        output.p(serialDesc, 1, sja.a, self.popup);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.startAt);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.endAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Popup getPopup() {
        return this.popup;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getStartAt() {
        return this.startAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getEndAt() {
        return this.endAt;
    }

    public final UserPopupEvent copy(String id, Popup popup, OffsetDateTime startAt, OffsetDateTime endAt) {
        id.getClass();
        popup.getClass();
        startAt.getClass();
        endAt.getClass();
        return new UserPopupEvent(id, popup, startAt, endAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPopupEvent)) {
            return false;
        }
        UserPopupEvent userPopupEvent = (UserPopupEvent) other;
        return pa7.t(this.id, userPopupEvent.id) && pa7.t(this.popup, userPopupEvent.popup) && pa7.t(this.startAt, userPopupEvent.startAt) && pa7.t(this.endAt, userPopupEvent.endAt);
    }

    public final OffsetDateTime getEndAt() {
        return this.endAt;
    }

    public final String getId() {
        return this.id;
    }

    public final Popup getPopup() {
        return this.popup;
    }

    public final OffsetDateTime getStartAt() {
        return this.startAt;
    }

    public int hashCode() {
        return this.endAt.hashCode() + ((this.startAt.hashCode() + ((this.popup.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "UserPopupEvent(id=" + this.id + ", popup=" + this.popup + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ")";
    }

    public static /* synthetic */ void getEndAt$annotations() {
    }

    public static /* synthetic */ void getStartAt$annotations() {
    }

    public UserPopupEvent(String str, Popup popup, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        str.getClass();
        popup.getClass();
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        this.id = str;
        this.popup = popup;
        this.startAt = offsetDateTime;
        this.endAt = offsetDateTime2;
    }
}
