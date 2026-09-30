package tech.chatmind.api.events.model;

import defpackage.ag2;
import defpackage.e05;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.vd8;
import defpackage.xyc;
import defpackage.z7c;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006,"}, d2 = {"Ltech/chatmind/api/events/model/EventRequest;", "", "", "timezone", "locale", "", "supportJSBridge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/EventRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Ltech/chatmind/api/events/model/EventRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTimezone", "getLocale", "Z", "getSupportJSBridge", "Companion", "d05", "e05", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class EventRequest {
    public static final int $stable = 0;
    public static final e05 Companion = new e05();
    private final String locale;
    private final boolean supportJSBridge;
    private final String timezone;

    public /* synthetic */ EventRequest(int i, String str, String str2, boolean z, xyc xycVar) {
        if ((i & 1) == 0) {
            str = TimeZone.getDefault().getID();
            str.getClass();
        }
        this.timezone = str;
        if ((i & 2) == 0) {
            this.locale = vd8.d();
        } else {
            this.locale = str2;
        }
        if ((i & 4) == 0) {
            this.supportJSBridge = true;
        } else {
            this.supportJSBridge = z;
        }
    }

    public static /* synthetic */ EventRequest copy$default(EventRequest eventRequest, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventRequest.timezone;
        }
        if ((i & 2) != 0) {
            str2 = eventRequest.locale;
        }
        if ((i & 4) != 0) {
            z = eventRequest.supportJSBridge;
        }
        return eventRequest.copy(str, str2, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(EventRequest self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc)) {
            output.w(serialDesc, 0, self.timezone);
        } else {
            String str = self.timezone;
            String id = TimeZone.getDefault().getID();
            id.getClass();
            if (!pa7.t(str, id)) {
                output.w(serialDesc, 0, self.timezone);
            }
        }
        if (output.g(serialDesc) || !pa7.t(self.locale, vd8.d())) {
            output.w(serialDesc, 1, self.locale);
        }
        if (!output.g(serialDesc) && self.supportJSBridge) {
            return;
        }
        output.o(serialDesc, 2, self.supportJSBridge);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSupportJSBridge() {
        return this.supportJSBridge;
    }

    public final EventRequest copy(String timezone, String locale, boolean supportJSBridge) {
        timezone.getClass();
        locale.getClass();
        return new EventRequest(timezone, locale, supportJSBridge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRequest)) {
            return false;
        }
        EventRequest eventRequest = (EventRequest) other;
        return pa7.t(this.timezone, eventRequest.timezone) && pa7.t(this.locale, eventRequest.locale) && this.supportJSBridge == eventRequest.supportJSBridge;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final boolean getSupportJSBridge() {
        return this.supportJSBridge;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return Boolean.hashCode(this.supportJSBridge) + ub3.c(this.timezone.hashCode() * 31, 31, this.locale);
    }

    public String toString() {
        String str = this.timezone;
        String str2 = this.locale;
        return ub3.m(ib8.o("EventRequest(timezone=", str, ", locale=", str2, ", supportJSBridge="), this.supportJSBridge, ")");
    }

    public EventRequest() {
        this((String) null, (String) null, false, 7, (rp3) null);
    }

    public EventRequest(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.timezone = str;
        this.locale = str2;
        this.supportJSBridge = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventRequest(String str, String str2, boolean z, int i, rp3 rp3Var) {
        if ((i & 1) != 0) {
            str = TimeZone.getDefault().getID();
            str.getClass();
        }
        this(str, (i & 2) != 0 ? vd8.d() : str2, (i & 4) != 0 ? true : z);
    }
}
