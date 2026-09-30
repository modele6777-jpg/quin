package tech.chatmind.api;

import defpackage.ag2;
import defpackage.av0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, d2 = {"Ltech/chatmind/api/BasicRequest;", "", "", "uid", "aid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self", "(Ltech/chatmind/api/BasicRequest;Lag2;Lnyc;)V", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "getAid", "Companion", "zu0", "av0", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public class BasicRequest {
    public static final int $stable = 8;
    public static final av0 Companion = new av0();
    private final String aid;
    private final String uid;

    public /* synthetic */ BasicRequest(int i, String str, String str2, xyc xycVar) {
        this.uid = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.aid = "2405";
        } else {
            this.aid = str2;
        }
    }

    public static final /* synthetic */ void write$Self(BasicRequest self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.getUid() != null) {
            output.A(serialDesc, 0, p4e.a, self.getUid());
        }
        if (!output.g(serialDesc) && pa7.t(self.getAid(), "2405")) {
            return;
        }
        output.w(serialDesc, 1, self.getAid());
    }

    public String getAid() {
        return this.aid;
    }

    public String getUid() {
        return this.uid;
    }

    public BasicRequest() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public BasicRequest(String str, String str2) {
        str2.getClass();
        this.uid = str;
        this.aid = str2;
    }

    public /* synthetic */ BasicRequest(String str, String str2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "2405" : str2);
    }
}
