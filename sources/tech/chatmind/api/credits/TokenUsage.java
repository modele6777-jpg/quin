package tech.chatmind.api.credits;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bze;
import defpackage.cze;
import defpackage.nyc;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/credits/TokenUsage;", "", "", "hasToken", "", "outputUsedTokens", "remainingTokens", "<init>", "(ZII)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZIILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/TokenUsage;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "copy", "(ZII)Ltech/chatmind/api/credits/TokenUsage;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasToken", "I", "getOutputUsedTokens", "getRemainingTokens", "Companion", "bze", "cze", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TokenUsage {
    public static final int $stable = 0;
    public static final cze Companion = new cze();
    private final boolean hasToken;
    private final int outputUsedTokens;
    private final int remainingTokens;

    public /* synthetic */ TokenUsage(int i, boolean z, int i2, int i3, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, bze.a.e());
            throw null;
        }
        this.hasToken = z;
        this.outputUsedTokens = i2;
        this.remainingTokens = i3;
    }

    public static /* synthetic */ TokenUsage copy$default(TokenUsage tokenUsage, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = tokenUsage.hasToken;
        }
        if ((i3 & 2) != 0) {
            i = tokenUsage.outputUsedTokens;
        }
        if ((i3 & 4) != 0) {
            i2 = tokenUsage.remainingTokens;
        }
        return tokenUsage.copy(z, i, i2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TokenUsage self, ag2 output, nyc serialDesc) {
        output.o(serialDesc, 0, self.hasToken);
        output.v(1, self.outputUsedTokens, serialDesc);
        output.v(2, self.remainingTokens, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasToken() {
        return this.hasToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOutputUsedTokens() {
        return this.outputUsedTokens;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRemainingTokens() {
        return this.remainingTokens;
    }

    public final TokenUsage copy(boolean hasToken, int outputUsedTokens, int remainingTokens) {
        return new TokenUsage(hasToken, outputUsedTokens, remainingTokens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenUsage)) {
            return false;
        }
        TokenUsage tokenUsage = (TokenUsage) other;
        return this.hasToken == tokenUsage.hasToken && this.outputUsedTokens == tokenUsage.outputUsedTokens && this.remainingTokens == tokenUsage.remainingTokens;
    }

    public final boolean getHasToken() {
        return this.hasToken;
    }

    public final int getOutputUsedTokens() {
        return this.outputUsedTokens;
    }

    public final int getRemainingTokens() {
        return this.remainingTokens;
    }

    public int hashCode() {
        return Integer.hashCode(this.remainingTokens) + ub3.b(this.outputUsedTokens, Boolean.hashCode(this.hasToken) * 31, 31);
    }

    public String toString() {
        boolean z = this.hasToken;
        int i = this.outputUsedTokens;
        int i2 = this.remainingTokens;
        StringBuilder sb = new StringBuilder("TokenUsage(hasToken=");
        sb.append(z);
        sb.append(", outputUsedTokens=");
        sb.append(i);
        sb.append(", remainingTokens=");
        return tec.g(i2, ")", sb);
    }

    public TokenUsage(boolean z, int i, int i2) {
        this.hasToken = z;
        this.outputUsedTokens = i;
        this.remainingTokens = i2;
    }
}
