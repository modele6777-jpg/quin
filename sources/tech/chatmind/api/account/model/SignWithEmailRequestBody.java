package tech.chatmind.api.account.model;

import defpackage.ag2;
import defpackage.aid;
import defpackage.an1;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import defpackage.zhd;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Ltech/chatmind/api/account/model/SignWithEmailRequestBody;", "", "", "email", "code", "csrfToken", "", "redirect", "json", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/account/model/SignWithEmailRequestBody;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ltech/chatmind/api/account/model/SignWithEmailRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getCode", "getCsrfToken", "Z", "getRedirect", "getJson", "Companion", "zhd", "aid", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SignWithEmailRequestBody {
    public static final int $stable = 0;
    public static final aid Companion = new aid();
    private final String code;
    private final String csrfToken;
    private final String email;
    private final boolean json;
    private final boolean redirect;

    public /* synthetic */ SignWithEmailRequestBody(int i, String str, String str2, String str3, boolean z, boolean z2, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, zhd.a.e());
            throw null;
        }
        this.email = str;
        this.code = str2;
        this.csrfToken = str3;
        if ((i & 8) == 0) {
            this.redirect = false;
        } else {
            this.redirect = z;
        }
        if ((i & 16) == 0) {
            this.json = true;
        } else {
            this.json = z2;
        }
    }

    public static /* synthetic */ SignWithEmailRequestBody copy$default(SignWithEmailRequestBody signWithEmailRequestBody, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signWithEmailRequestBody.email;
        }
        if ((i & 2) != 0) {
            str2 = signWithEmailRequestBody.code;
        }
        if ((i & 4) != 0) {
            str3 = signWithEmailRequestBody.csrfToken;
        }
        if ((i & 8) != 0) {
            z = signWithEmailRequestBody.redirect;
        }
        if ((i & 16) != 0) {
            z2 = signWithEmailRequestBody.json;
        }
        boolean z3 = z2;
        String str4 = str3;
        return signWithEmailRequestBody.copy(str, str2, str4, z, z3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SignWithEmailRequestBody self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.email);
        output.w(serialDesc, 1, self.code);
        output.w(serialDesc, 2, self.csrfToken);
        if (output.g(serialDesc) || self.redirect) {
            output.o(serialDesc, 3, self.redirect);
        }
        if (!output.g(serialDesc) && self.json) {
            return;
        }
        output.o(serialDesc, 4, self.json);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCsrfToken() {
        return this.csrfToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRedirect() {
        return this.redirect;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getJson() {
        return this.json;
    }

    public final SignWithEmailRequestBody copy(String email, String code, String csrfToken, boolean redirect, boolean json) {
        email.getClass();
        code.getClass();
        csrfToken.getClass();
        return new SignWithEmailRequestBody(email, code, csrfToken, redirect, json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignWithEmailRequestBody)) {
            return false;
        }
        SignWithEmailRequestBody signWithEmailRequestBody = (SignWithEmailRequestBody) other;
        return pa7.t(this.email, signWithEmailRequestBody.email) && pa7.t(this.code, signWithEmailRequestBody.code) && pa7.t(this.csrfToken, signWithEmailRequestBody.csrfToken) && this.redirect == signWithEmailRequestBody.redirect && this.json == signWithEmailRequestBody.json;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCsrfToken() {
        return this.csrfToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getJson() {
        return this.json;
    }

    public final boolean getRedirect() {
        return this.redirect;
    }

    public int hashCode() {
        return Boolean.hashCode(this.json) + ub3.d(ub3.c(ub3.c(this.email.hashCode() * 31, 31, this.code), 31, this.csrfToken), 31, this.redirect);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.code;
        String str3 = this.csrfToken;
        boolean z = this.redirect;
        boolean z2 = this.json;
        StringBuilder sbO = ib8.o("SignWithEmailRequestBody(email=", str, ", code=", str2, ", csrfToken=");
        sbO.append(str3);
        sbO.append(", redirect=");
        sbO.append(z);
        sbO.append(", json=");
        return ub3.m(sbO, z2, ")");
    }

    public SignWithEmailRequestBody(String str, String str2, String str3, boolean z, boolean z2) {
        tec.x(str, str2, str3);
        this.email = str;
        this.code = str2;
        this.csrfToken = str3;
        this.redirect = z;
        this.json = z2;
    }

    public /* synthetic */ SignWithEmailRequestBody(String str, String str2, String str3, boolean z, boolean z2, int i, rp3 rp3Var) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }
}
