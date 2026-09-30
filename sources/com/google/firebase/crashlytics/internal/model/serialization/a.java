package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.parseFile(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader);
        }
    }
}
