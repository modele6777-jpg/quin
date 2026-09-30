package tech.chatmind.api.events.model;

import defpackage.ag2;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rma;
import defpackage.rp3;
import defpackage.sma;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Ltech/chatmind/api/events/model/PopupTracking;", "", "Ltech/chatmind/api/events/model/PopupTrackingEvent;", "view", "close", "<init>", "(Ltech/chatmind/api/events/model/PopupTrackingEvent;Ltech/chatmind/api/events/model/PopupTrackingEvent;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/events/model/PopupTrackingEvent;Ltech/chatmind/api/events/model/PopupTrackingEvent;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/PopupTracking;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/events/model/PopupTrackingEvent;", "component2", "copy", "(Ltech/chatmind/api/events/model/PopupTrackingEvent;Ltech/chatmind/api/events/model/PopupTrackingEvent;)Ltech/chatmind/api/events/model/PopupTracking;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/events/model/PopupTrackingEvent;", "getView", "getClose", "Companion", "qma", "rma", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PopupTracking {
    public static final int $stable = 0;
    public static final rma Companion = new rma();
    private final PopupTrackingEvent close;
    private final PopupTrackingEvent view;

    public /* synthetic */ PopupTracking(int i, PopupTrackingEvent popupTrackingEvent, PopupTrackingEvent popupTrackingEvent2, xyc xycVar) {
        if ((i & 1) == 0) {
            this.view = null;
        } else {
            this.view = popupTrackingEvent;
        }
        if ((i & 2) == 0) {
            this.close = null;
        } else {
            this.close = popupTrackingEvent2;
        }
    }

    public static /* synthetic */ PopupTracking copy$default(PopupTracking popupTracking, PopupTrackingEvent popupTrackingEvent, PopupTrackingEvent popupTrackingEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            popupTrackingEvent = popupTracking.view;
        }
        if ((i & 2) != 0) {
            popupTrackingEvent2 = popupTracking.close;
        }
        return popupTracking.copy(popupTrackingEvent, popupTrackingEvent2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PopupTracking self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.view != null) {
            output.A(serialDesc, 0, sma.a, self.view);
        }
        if (!output.g(serialDesc) && self.close == null) {
            return;
        }
        output.A(serialDesc, 1, sma.a, self.close);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PopupTrackingEvent getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PopupTrackingEvent getClose() {
        return this.close;
    }

    public final PopupTracking copy(PopupTrackingEvent view, PopupTrackingEvent close) {
        return new PopupTracking(view, close);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupTracking)) {
            return false;
        }
        PopupTracking popupTracking = (PopupTracking) other;
        return pa7.t(this.view, popupTracking.view) && pa7.t(this.close, popupTracking.close);
    }

    public final PopupTrackingEvent getClose() {
        return this.close;
    }

    public final PopupTrackingEvent getView() {
        return this.view;
    }

    public int hashCode() {
        PopupTrackingEvent popupTrackingEvent = this.view;
        int iHashCode = (popupTrackingEvent == null ? 0 : popupTrackingEvent.hashCode()) * 31;
        PopupTrackingEvent popupTrackingEvent2 = this.close;
        return iHashCode + (popupTrackingEvent2 != null ? popupTrackingEvent2.hashCode() : 0);
    }

    public String toString() {
        return "PopupTracking(view=" + this.view + ", close=" + this.close + ")";
    }

    public PopupTracking() {
        this((PopupTrackingEvent) null, (PopupTrackingEvent) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public PopupTracking(PopupTrackingEvent popupTrackingEvent, PopupTrackingEvent popupTrackingEvent2) {
        this.view = popupTrackingEvent;
        this.close = popupTrackingEvent2;
    }

    public /* synthetic */ PopupTracking(PopupTrackingEvent popupTrackingEvent, PopupTrackingEvent popupTrackingEvent2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : popupTrackingEvent, (i & 2) != 0 ? null : popupTrackingEvent2);
    }
}
