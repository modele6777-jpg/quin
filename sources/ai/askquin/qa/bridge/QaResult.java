package ai.askquin.qa.bridge;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.syc;
import defpackage.tec;
import defpackage.ti7;
import defpackage.tyc;
import defpackage.wi7;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lai/askquin/qa/bridge/QaResult;", "", "Companion", "Ok", "Err", "ai/askquin/qa/bridge/b", "Lai/askquin/qa/bridge/QaResult$Err;", "Lai/askquin/qa/bridge/QaResult$Ok;", "Quin:qa-bridge"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface QaResult {
    public static final b Companion = b.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lai/askquin/qa/bridge/QaResult$Ok;", "Lai/askquin/qa/bridge/QaResult;", "Lti7;", "data", "<init>", "(Lti7;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILti7;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_qa_bridge", "(Lai/askquin/qa/bridge/QaResult$Ok;Lag2;Lnyc;)V", "write$Self", "component1", "()Lti7;", "copy", "(Lti7;)Lai/askquin/qa/bridge/QaResult$Ok;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lti7;", "getData", "Companion", "ai/askquin/qa/bridge/e", "ai/askquin/qa/bridge/f", "Quin:qa-bridge"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    @syc("ok")
    public static final /* data */ class Ok implements QaResult {
        public static final f Companion = new f();
        private final ti7 data;

        public /* synthetic */ Ok(int i, ti7 ti7Var, xyc xycVar) {
            if ((i & 1) == 0) {
                this.data = new ti7(qu4.a);
            } else {
                this.data = ti7Var;
            }
        }

        public static /* synthetic */ Ok copy$default(Ok ok, ti7 ti7Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ti7Var = ok.data;
            }
            return ok.copy(ti7Var);
        }

        public static final /* synthetic */ void write$Self$Quin_qa_bridge(Ok self, ag2 output, nyc serialDesc) {
            if (!output.g(serialDesc) && pa7.t(self.data, new ti7(qu4.a))) {
                return;
            }
            output.p(serialDesc, 0, wi7.a, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ti7 getData() {
            return this.data;
        }

        public final Ok copy(ti7 data) {
            data.getClass();
            return new Ok(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ok) && pa7.t(this.data, ((Ok) other).data);
        }

        public final ti7 getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.a.hashCode();
        }

        public String toString() {
            return "Ok(data=" + this.data + ")";
        }

        public Ok() {
            this((ti7) null, 1, (rp3) (0 == true ? 1 : 0));
        }

        public Ok(ti7 ti7Var) {
            ti7Var.getClass();
            this.data = ti7Var;
        }

        public /* synthetic */ Ok(ti7 ti7Var, int i, rp3 rp3Var) {
            this((i & 1) != 0 ? new ti7(qu4.a) : ti7Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lai/askquin/qa/bridge/QaResult$Err;", "Lai/askquin/qa/bridge/QaResult;", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_qa_bridge", "(Lai/askquin/qa/bridge/QaResult$Err;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lai/askquin/qa/bridge/QaResult$Err;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getCode", "Companion", "ai/askquin/qa/bridge/c", "ai/askquin/qa/bridge/d", "Quin:qa-bridge"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    @tyc
    @syc("err")
    public static final /* data */ class Err implements QaResult {
        public static final d Companion = new d();
        private final String code;
        private final String message;

        public /* synthetic */ Err(int i, String str, String str2, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, c.a.e());
                throw null;
            }
            this.message = str;
            if ((i & 2) == 0) {
                this.code = "error";
            } else {
                this.code = str2;
            }
        }

        public static /* synthetic */ Err copy$default(Err err, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = err.message;
            }
            if ((i & 2) != 0) {
                str2 = err.code;
            }
            return err.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Quin_qa_bridge(Err self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.message);
            if (!output.g(serialDesc) && pa7.t(self.code, "error")) {
                return;
            }
            output.w(serialDesc, 1, self.code);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Err copy(String message, String code) {
            message.getClass();
            code.getClass();
            return new Err(message, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Err)) {
                return false;
            }
            Err err = (Err) other;
            return pa7.t(this.message, err.message) && pa7.t(this.code, err.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.code.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            return tec.m("Err(message=", this.message, ", code=", this.code, ")");
        }

        public Err(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.message = str;
            this.code = str2;
        }

        public /* synthetic */ Err(String str, String str2, int i, rp3 rp3Var) {
            this(str, (i & 2) != 0 ? "error" : str2);
        }
    }
}
