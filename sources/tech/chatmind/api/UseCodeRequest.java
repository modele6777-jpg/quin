package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nkf;
import defpackage.nyc;
import defpackage.okf;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u0016¨\u0006)"}, d2 = {"Ltech/chatmind/api/UseCodeRequest;", "", "", "code", "aid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UseCodeRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/UseCodeRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getAid", "getUid", "uid", "Companion", "nkf", "okf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UseCodeRequest {
    public static final int $stable = 8;
    public static final okf Companion = new okf();
    private final /* synthetic */ BasicRequest $$delegate_0;
    private final String aid;
    private final String code;

    public /* synthetic */ UseCodeRequest(int i, String str, String str2, xyc xycVar) {
        String str3 = null;
        byte b = 0;
        if (3 != (i & 3)) {
            an1.R(i, 3, nkf.a.e());
            throw null;
        }
        this.code = str;
        this.aid = str2;
        this.$$delegate_0 = new BasicRequest(str3, getAid(), 1, (rp3) (b == true ? 1 : 0));
    }

    public static /* synthetic */ UseCodeRequest copy$default(UseCodeRequest useCodeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = useCodeRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = useCodeRequest.aid;
        }
        return useCodeRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UseCodeRequest self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.code);
        output.w(serialDesc, 1, self.getAid());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    public final UseCodeRequest copy(String code, String aid) {
        code.getClass();
        aid.getClass();
        return new UseCodeRequest(code, aid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseCodeRequest)) {
            return false;
        }
        UseCodeRequest useCodeRequest = (UseCodeRequest) other;
        return pa7.t(this.code, useCodeRequest.code) && pa7.t(this.aid, useCodeRequest.aid);
    }

    public String getAid() {
        return this.aid;
    }

    public final String getCode() {
        return this.code;
    }

    public String getUid() {
        return this.$$delegate_0.getUid();
    }

    public int hashCode() {
        return this.aid.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return tec.m("UseCodeRequest(code=", this.code, ", aid=", this.aid, ")");
    }

    public UseCodeRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.$$delegate_0 = new BasicRequest((String) null, str2, 1, (rp3) (0 == true ? 1 : 0));
        this.code = str;
        this.aid = str2;
    }
}
