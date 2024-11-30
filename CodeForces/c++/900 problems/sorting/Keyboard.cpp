#include <iostream>
#include <windows.h>
using namespace std;

int main()
{
    char direction; cin >> direction;
    string str; cin >> str;
    string result = "";
    for (char& ch:str)
    {
        SHORT virtualKey = VkKeyScan(ch);
        int scanCode = MapVirtualKey(LOBYTE(virtualKey), MAPVK_VK_TO_VSC);

        UINT virtualKeyFromScan = MapVirtualKey(scanCode+(direction=='R' ? -1 : 1), MAPVK_VSC_TO_VK);

        char charFromScanCode = MapVirtualKey(virtualKeyFromScan, MAPVK_VK_TO_CHAR);

        result+=tolower(charFromScanCode);
    }
    cout << result;
    return 0;
}