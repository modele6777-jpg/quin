package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ nx6(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[SYNTHETIC] */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int length;
        int i;
        long j;
        q0a q0aVar;
        char cCharAt;
        int i2;
        int i3 = this.a;
        int i4 = 0;
        int i5 = this.c;
        int i6 = this.b;
        switch (i3) {
            case 0:
                une uneVar = (une) obj;
                if (i6 < 0 || i5 < 0) {
                    l37.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i6 + " and " + i5 + " respectively.");
                }
                int iG = 0;
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = iG + 1;
                    long j2 = uneVar.g;
                    q0a q0aVar2 = uneVar.c;
                    int iG2 = eue.g(j2);
                    long j3 = uneVar.g;
                    if (iG2 <= i8) {
                        iG = eue.g(j3);
                        length = 0;
                        while (i4 < i5) {
                            i = length + 1;
                            j = uneVar.g;
                            q0aVar = uneVar.c;
                            if (eue.f(j) + i < q0aVar.length()) {
                                length = q0aVar.length() - eue.f(uneVar.g);
                                vfh.y(uneVar, eue.f(uneVar.g), eue.f(uneVar.g) + length);
                                vfh.y(uneVar, eue.g(uneVar.g) - iG, eue.g(uneVar.g));
                                return wef.a;
                            }
                            cCharAt = q0aVar.charAt((eue.f(uneVar.g) + i) - 1);
                            char cCharAt2 = q0aVar.charAt(eue.f(uneVar.g) + i);
                            if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                length = i;
                            } else {
                                length += 2;
                            }
                            i4++;
                        }
                        vfh.y(uneVar, eue.f(uneVar.g), eue.f(uneVar.g) + length);
                        vfh.y(uneVar, eue.g(uneVar.g) - iG, eue.g(uneVar.g));
                        return wef.a;
                    }
                    iG = (Character.isHighSurrogate(q0aVar2.charAt((eue.g(j3) - i8) + (-1))) && Character.isLowSurrogate(q0aVar2.charAt(eue.g(uneVar.g) - i8))) ? iG + 2 : i8;
                }
                length = 0;
                while (i4 < i5) {
                    i = length + 1;
                    j = uneVar.g;
                    q0aVar = uneVar.c;
                    if (eue.f(j) + i < q0aVar.length()) {
                        length = q0aVar.length() - eue.f(uneVar.g);
                        vfh.y(uneVar, eue.f(uneVar.g), eue.f(uneVar.g) + length);
                        vfh.y(uneVar, eue.g(uneVar.g) - iG, eue.g(uneVar.g));
                        return wef.a;
                    }
                    cCharAt = q0aVar.charAt((eue.f(uneVar.g) + i) - 1);
                    char cCharAt3 = q0aVar.charAt(eue.f(uneVar.g) + i);
                    if (Character.isHighSurrogate(cCharAt)) {
                        length = i;
                    } else {
                        length = i;
                    }
                    i4++;
                }
                vfh.y(uneVar, eue.f(uneVar.g), eue.f(uneVar.g) + length);
                vfh.y(uneVar, eue.g(uneVar.g) - iG, eue.g(uneVar.g));
                return wef.a;
            default:
                SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) obj;
                List<SeasonalFollowUp> followUps = seasonalReadingResponse.getFollowUps();
                if (followUps == null) {
                    followUps = pu4.a;
                }
                if (followUps.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator<T> it = followUps.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        String answer = ((SeasonalFollowUp) it.next()).getAnswer();
                        if (answer != null && !v4e.Q(answer) && (i2 = i2 + 1) < 0) {
                            t72.Y();
                            throw null;
                        }
                    }
                }
                if (i2 > i6) {
                    return new spc(seasonalReadingResponse);
                }
                if (!followUps.isEmpty()) {
                    Iterator<T> it2 = followUps.iterator();
                    while (it2.hasNext()) {
                        if (((SeasonalFollowUp) it2.next()).getStatus() == SeasonalStatus.ERROR && (i4 = i4 + 1) < 0) {
                            t72.Y();
                            throw null;
                        }
                    }
                }
                if (i4 > i5) {
                    return new opc(seasonalReadingResponse.getErrorMessage());
                }
                return null;
        }
    }
}
