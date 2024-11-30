cmake_minimum_required(VERSION 3.28)
project(1000_problems)

set(CMAKE_CXX_STANDARD 17)

add_executable(sorting
        #sorting/Dragons.cpp
        sorting/MahmoudAndTriangle.cpp)
add_executable(constructive_algorithms
        #constructive_algorithms/OlyaAndGamesWithArrays.cpp
        #constructive_algorithms/ShiftsAndSorting.cpp
        #constructive_algorithms/AssemblyViaRemainders.cpp
        #constructive_algorithms/FavouritePermutation.cpp
        constructive_algorithms/FavouritePermutation.cpp
)
add_executable(math math/TheatreSquare.cpp)
add_executable(implementation
        #implementation/StringTask.cpp
        #implementation/CapsLock.cpp
        implementation/YoungPhysicist.cpp
)
add_executable(binary_search
        #binary_search/KDivisibleSum.cpp
        #binary_search/TrafficLight.cpp
        binary_search/ThinkIT.cpp
)
add_executable(data_structures data_structures/PogressiveSquare.cpp)
