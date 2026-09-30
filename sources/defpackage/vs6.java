package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvs6;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lf84;", "", "method", "Ljava/lang/String;", "templatePath", "", "code", "I", "Lkzc;", "server", "Lkzc;", "", "Liy9;", "diagnosticInfo", "Ljava/util/List;", "a", "()Ljava/util/List;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class vs6 extends RuntimeException implements f84 {
    private final int code;
    private final List<iy9> diagnosticInfo;
    private final String method;
    private final kzc server;
    private final String templatePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs6(String str, String str2, int i, kzc kzcVar, String str3, List list) {
        super("HTTP " + i + " " + str2);
        str.getClass();
        this.method = str;
        this.templatePath = str2;
        this.code = i;
        this.server = kzcVar;
        setStackTrace(new StackTraceElement[]{new StackTraceElement(tec.e(i, "tech.chatmind.api.http.Http"), str2, "RetrofitHttpNonFatal.kt", i)});
        c78 c78VarW = t72.w();
        c78VarW.add(new iy9("http_group_key", str2 + "#" + i));
        c78VarW.add(new iy9("http_method", str));
        c78VarW.add(new iy9("http_path", str2));
        c78VarW.add(new iy9("http_code", String.valueOf(i)));
        String str4 = kzcVar.a;
        if (str4 != null) {
            c78VarW.add(new iy9("server_response_body", str4));
        }
        String str5 = kzcVar.b;
        if (str5 != null) {
            c78VarW.add(new iy9("server_error_code", str5));
        }
        String str6 = kzcVar.c;
        if (str6 != null) {
            str6 = v4e.Q(str6) ? null : str6;
            if (str6 != null) {
                c78VarW.add(new iy9("server_error_message", str6));
            }
        }
        String str7 = kzcVar.d;
        if (str7 != null) {
            c78VarW.add(new iy9("server_response_error", str7));
        }
        String str8 = kzcVar.e;
        if (str8 != null) {
            str8 = v4e.Q(str8) ? null : str8;
            if (str8 != null) {
                c78VarW.add(new iy9("server_response_data", str8));
            }
        }
        if (str3 != null) {
            str3 = v4e.Q(str3) ? null : str3;
            if (str3 != null) {
                c78VarW.add(new iy9("x_trace_id", str3));
            }
        }
        c78VarW.addAll(list);
        this.diagnosticInfo = c78VarW.n();
    }

    @Override // defpackage.f84
    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDiagnosticInfo() {
        return this.diagnosticInfo;
    }

    public final boolean b() {
        if (this.code == 401) {
            return false;
        }
        String str = this.server.c;
        if (c5e.v(str != null ? v4e.o0(str).toString() : null, "No auth", true)) {
            return false;
        }
        if (pa7.t(this.method, "POST") && pa7.t(this.templatePath, "/api/user/update-current-card") && this.code == 404) {
            return false;
        }
        if (pa7.t(this.method, "GET") && pa7.t(this.templatePath, "/api/reports/annual-forecast/{year}") && this.code == 404 && pa7.t(this.server.b, "120001")) {
            return false;
        }
        if (this.code == 400 && pa7.t(this.server.b, "10017") && ws6.a.contains(this.templatePath)) {
            return false;
        }
        if (pa7.t(this.method, "DELETE") && pa7.t(this.templatePath, "/api/tarot/readings/{chatId}") && this.code == 404) {
            return false;
        }
        return !pa7.t(this.templatePath, "/api/activity/explore-banner") || this.code < 500;
    }
}
