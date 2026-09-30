package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wgb;
import defpackage.xgb;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Ltech/chatmind/api/ReadingShareRequest;", "", "", "uid", "scene", "format", "channel", "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ReadingShareRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/ReadingShareRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "getScene", "getFormat", "getChannel", "getLang", "Companion", "wgb", "xgb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReadingShareRequest {
    public static final int $stable = 0;
    public static final xgb Companion = new xgb();
    private final String channel;
    private final String format;
    private final String lang;
    private final String scene;
    private final String uid;

    public /* synthetic */ ReadingShareRequest(int i, String str, String str2, String str3, String str4, String str5, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, wgb.a.e());
            throw null;
        }
        this.uid = str;
        this.scene = str2;
        this.format = str3;
        this.channel = str4;
        this.lang = str5;
    }

    public static /* synthetic */ ReadingShareRequest copy$default(ReadingShareRequest readingShareRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readingShareRequest.uid;
        }
        if ((i & 2) != 0) {
            str2 = readingShareRequest.scene;
        }
        if ((i & 4) != 0) {
            str3 = readingShareRequest.format;
        }
        if ((i & 8) != 0) {
            str4 = readingShareRequest.channel;
        }
        if ((i & 16) != 0) {
            str5 = readingShareRequest.lang;
        }
        String str6 = str5;
        String str7 = str3;
        return readingShareRequest.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ReadingShareRequest self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.uid);
        output.w(serialDesc, 1, self.scene);
        output.w(serialDesc, 2, self.format);
        output.w(serialDesc, 3, self.channel);
        output.w(serialDesc, 4, self.lang);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    public final ReadingShareRequest copy(String uid, String scene, String format, String channel, String lang) {
        uid.getClass();
        scene.getClass();
        format.getClass();
        channel.getClass();
        lang.getClass();
        return new ReadingShareRequest(uid, scene, format, channel, lang);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingShareRequest)) {
            return false;
        }
        ReadingShareRequest readingShareRequest = (ReadingShareRequest) other;
        return pa7.t(this.uid, readingShareRequest.uid) && pa7.t(this.scene, readingShareRequest.scene) && pa7.t(this.format, readingShareRequest.format) && pa7.t(this.channel, readingShareRequest.channel) && pa7.t(this.lang, readingShareRequest.lang);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.lang.hashCode() + ub3.c(ub3.c(ub3.c(this.uid.hashCode() * 31, 31, this.scene), 31, this.format), 31, this.channel);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.scene;
        String str3 = this.format;
        String str4 = this.channel;
        String str5 = this.lang;
        StringBuilder sbO = ib8.o("ReadingShareRequest(uid=", str, ", scene=", str2, ", format=");
        ub3.v(sbO, str3, ", channel=", str4, ", lang=");
        return ks0.l(sbO, str5, ")");
    }

    public ReadingShareRequest(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.uid = str;
        this.scene = str2;
        this.format = str3;
        this.channel = str4;
        this.lang = str5;
    }
}
