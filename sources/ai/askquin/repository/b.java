package ai.askquin.repository;

import ai.askquin.model.DailyFortuneContent;
import ai.askquin.model.DailyFortuneDirectionContent;
import ai.askquin.model.Scene;
import android.content.Context;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.bm8;
import defpackage.c5e;
import defpackage.dd0;
import defpackage.fzc;
import defpackage.ib8;
import defpackage.iy9;
import defpackage.o5c;
import defpackage.ox1;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.q1c;
import defpackage.qhe;
import defpackage.s72;
import defpackage.t72;
import defpackage.vd8;
import defpackage.vz9;
import defpackage.xh7;
import defpackage.ym8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.TarotCardInfo;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Context a;
    public Set f;
    public final LinkedHashMap b = new LinkedHashMap();
    public final vz9 c = q1c.f(pu4.a);
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public b(Context context) {
        this.a = context;
    }

    public static String a() {
        String strA = vd8.a();
        if (c5e.C(strA, "zh-CN", false) || c5e.C(strA, "zh-Hans", false) || strA.equals("zh")) {
            return "cn";
        }
        if (c5e.C(strA, "zh", false)) {
            return "tc";
        }
        if (c5e.C(strA, "ja", false)) {
            return "ja";
        }
        if (c5e.C(strA, "ko", false)) {
            return "ko";
        }
        return c5e.C(strA, "es", false) ? "es" : "en";
    }

    public final DailyFortuneDirectionContent b(qhe qheVar) {
        Object next;
        String strA = a();
        List list = (List) this.d.get(strA);
        if (list == null) {
            synchronized (this.d) {
                List list2 = (List) this.d.get(strA);
                if (list2 != null) {
                    list = list2;
                } else {
                    InputStream inputStreamOpen = this.a.getAssets().open("daily_fortune/" + strA + ".json");
                    inputStreamOpen.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    try {
                        String strL = o5c.l(bufferedReader);
                        bufferedReader.close();
                        xh7 xh7Var = fzc.a;
                        xh7Var.getClass();
                        Object objB = xh7Var.b(new dd0(DailyFortuneContent.Companion.serializer(), 0), strL);
                        this.d.put(strA, (List) objB);
                        list = (List) objB;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
            }
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((DailyFortuneContent) next).getCardKey(), qheVar.a));
        DailyFortuneContent dailyFortuneContent = (DailyFortuneContent) next;
        if (dailyFortuneContent == null) {
            return null;
        }
        return qheVar.b == 1 ? dailyFortuneContent.getUpright() : dailyFortuneContent.getReversed();
    }

    public final List c() throws IOException {
        String strD = vd8.d();
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.get(strD);
        if (list != null) {
            return list;
        }
        InputStream inputStreamOpen = this.a.getAssets().open(ib8.j("scene/", strD, ".json"));
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
        try {
            String strL = o5c.l(bufferedReader);
            bufferedReader.close();
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            List list2 = (List) xh7Var.b(new dd0(Scene.Companion.serializer(), 0), strL);
            linkedHashMap.put(strD, list2);
            return list2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(bufferedReader, th);
                throw th2;
            }
        }
    }

    public final TarotCardInfo d(TarotCardType tarotCardType, String str) {
        Map map;
        Object next;
        LocalAssetRepository$SkinMeaningOverride localAssetRepository$SkinMeaningOverride;
        tarotCardType.getClass();
        String strA = a();
        List list = (List) this.e.get(strA);
        if (list == null) {
            synchronized (this.e) {
                try {
                    List list2 = (List) this.e.get(strA);
                    if (list2 != null) {
                        list = list2;
                    } else {
                        InputStream inputStreamOpen = this.a.getAssets().open("tarot-info/" + strA + ".json");
                        inputStreamOpen.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                        try {
                            String strL = o5c.l(bufferedReader);
                            bufferedReader.close();
                            xh7 xh7Var = fzc.a;
                            xh7Var.getClass();
                            Object objB = xh7Var.b(new dd0(TarotCardInfo.Companion.serializer(), 0), strL);
                            this.e.put(strA, (List) objB);
                            list = (List) objB;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(bufferedReader, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        Iterator it = list.iterator();
        do {
            map = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((TarotCardInfo) next).getCardKey(), tarotCardType.getCardKey()));
        TarotCardInfo tarotCardInfo = (TarotCardInfo) next;
        if (tarotCardInfo == null) {
            return null;
        }
        if (str != null) {
            Set setO1 = this.f;
            if (setO1 == null) {
                synchronized (this) {
                    try {
                        setO1 = this.f;
                        if (setO1 == null) {
                            String[] list3 = this.a.getAssets().list("tarot-info");
                            if (list3 == null) {
                                list3 = new String[0];
                            }
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : list3) {
                                str2.getClass();
                                if (!c5e.u(str2, ".json", false)) {
                                    arrayList.add(str2);
                                }
                            }
                            setO1 = s72.o1(arrayList);
                            this.f = setO1;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            if (setO1.contains(str)) {
                String strA2 = a();
                iy9 iy9Var = new iy9(str, strA2);
                map = (Map) this.g.get(iy9Var);
                if (map == null) {
                    synchronized (this.g) {
                        try {
                            Map map2 = (Map) this.g.get(iy9Var);
                            if (map2 != null) {
                                map = map2;
                            } else {
                                InputStream inputStreamOpen2 = this.a.getAssets().open("tarot-info/" + str + "/" + strA2 + ".json");
                                inputStreamOpen2.getClass();
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen2, ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                try {
                                    String strL2 = o5c.l(bufferedReader2);
                                    bufferedReader2.close();
                                    xh7 xh7Var2 = fzc.a;
                                    xh7Var2.getClass();
                                    Iterable iterable = (Iterable) xh7Var2.b(new dd0(LocalAssetRepository$SkinMeaningOverride.Companion.serializer(), 0), strL2);
                                    int iF = bm8.F(t72.u(iterable, 10));
                                    if (iF < 16) {
                                        iF = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                                    for (Object obj : iterable) {
                                        linkedHashMap.put(((LocalAssetRepository$SkinMeaningOverride) obj).getCardKey(), obj);
                                    }
                                    this.g.put(iy9Var, linkedHashMap);
                                    map = linkedHashMap;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        ym8.t(bufferedReader2, th5);
                                        throw th6;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
            }
            if (map != null && (localAssetRepository$SkinMeaningOverride = (LocalAssetRepository$SkinMeaningOverride) map.get(tarotCardType.getCardKey())) != null) {
                return TarotCardInfo.copy$default(tarotCardInfo, null, null, null, null, null, null, null, null, null, null, localAssetRepository$SkinMeaningOverride.getDescription(), 1023, null);
            }
        }
        return tarotCardInfo;
    }
}
