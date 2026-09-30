package tech.chatmind.api.events.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ls0;
import defpackage.ms0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Ltech/chatmind/api/events/model/Background;", "", "", "dark", "light", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/Background;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/events/model/Background;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDark", "getLight", "Companion", "ls0", "ms0", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Background {
    public static final int $stable = 0;
    public static final ms0 Companion = new ms0();
    private final String dark;
    private final String light;

    public /* synthetic */ Background(int i, String str, String str2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, ls0.a.e());
            throw null;
        }
        this.dark = str;
        this.light = str2;
    }

    public static /* synthetic */ Background copy$default(Background background, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = background.dark;
        }
        if ((i & 2) != 0) {
            str2 = background.light;
        }
        return background.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Background self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.dark);
        output.w(serialDesc, 1, self.light);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    public final Background copy(String dark, String light) {
        dark.getClass();
        light.getClass();
        return new Background(dark, light);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Background)) {
            return false;
        }
        Background background = (Background) other;
        return pa7.t(this.dark, background.dark) && pa7.t(this.light, background.light);
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.light.hashCode() + (this.dark.hashCode() * 31);
    }

    public String toString() {
        return tec.m("Background(dark=", this.dark, ", light=", this.light, ")");
    }

    public Background(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.dark = str;
        this.light = str2;
    }
}
